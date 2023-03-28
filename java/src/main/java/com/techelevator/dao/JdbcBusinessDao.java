package com.techelevator.dao;

import com.techelevator.model.Business;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlInOutParameter;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcBusinessDao implements BusinessDao{
    private final JdbcTemplate jdbcTemplate;

    public JdbcBusinessDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }



//    works but want to narrow columns shown during search; screen shot shows example
//    @Override
//    public List<Business> displayAll() {
//        List<Business> allBusinesses = new ArrayList<>();
//
//        String sql = "SELECT * from businesses " +
//                "Order by business_category; ";
//
//        SqlRowSet rowSet = jdbcTemplate.queryForRowSet(sql);
//        while(rowSet.next()){
//            Business business = mapRowToBusiness(rowSet);
//            allBusinesses.add(business);
//        }
//        return allBusinesses;
//    }

    @Override
    public List<Business> displayAll() {
        List<Business> allBusinesses = new ArrayList<>();

        String sql = "SELECT business_id, business_name, business_category, business_number from businesses " +
                "Order by business_category; ";

        SqlRowSet rowSet = jdbcTemplate.queryForRowSet(sql);
        while(rowSet.next()){
            Business business = mapRowToBusiness(rowSet);
            allBusinesses.add(business);
       }
        return allBusinesses;
    }

    @Override
    public List<Business> findUserOwnedBusinesses(int userId) {
        List<Business> userOwned = new ArrayList<>();
        String sql = "SELECT business_name from businesses \n" +
                "join users_businesses using(business_id) \n" +
                "join users using(user_id) \n" +
                "where user_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, userId);
        while(results.next()){
            Business business = mapRowToBusiness(results);
            userOwned.add(business);
        }

        return userOwned;
    }

    @Override
    public List<Business> findByCategory(String businessCategory) {
        List<Business> businessByCategory = new ArrayList<>();
        String sql =
                "SELECT business_name, business_category, business_number, city, closest_major_city, state_abbreviation \n" +
                "from businesses\n" +
                "where business_category like '?%';";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, businessCategory);
        while(results.next()){
            Business business = mapRowToBusiness(results);
            businessByCategory.add(business);
        }
        return businessByCategory;
    }

    @Override
    public Business findByBusinessName(String businessName) {
        String sql = "SELECT business_name, business_category, business_number, city, closest_major_city, state_abbreviation \n" +
                "from businesses \n" +
                "where business_name  like '?%';";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, businessName);
        Business business = mapRowToBusiness(results);

        return business;
    }

    @Override
    public List<Business> listByMajorCityName(String majorCity) {
        List<Business> byMajorCity = new ArrayList<>();
        String sql = "SELECT business_name, business_category, business_number, city, closest_major_city, state_abbreviation \n" +
                "from businesses\n" +
                "where closest_major_city = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, majorCity);
        while (results.next()){
            Business business = mapRowToBusiness(results);
            byMajorCity.add(business);
        }
        return byMajorCity;
    }

    @Override
    public List<Business> findByOwnerFirst(String ownerFirstName) {
        List<Business> byOwnFirstName = new ArrayList<>();
        String sql = "SELECT business_name, business_category, business_number, city, closest_major_city, state_abbreviation " +
                "from businesses " +
                "where owner_first_name = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, ownerFirstName);
        while (results.next()){
            Business businesses = mapRowToBusiness(results);
            byOwnFirstName.add(businesses);
        }
        return byOwnFirstName;
    }

    @Override
    public List<Business> findByOwnerLast(String ownerLastName) {
        List<Business> byOwnLastName = new ArrayList<>();
        String sql = "SELECT business_name, business_category, business_number, city, closest_major_city, state_abbreviation " +
                "from businesses " +
                "where owner_last_name = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, ownerLastName);
        while (results.next()){
            Business businesses = mapRowToBusiness(results);
            byOwnLastName.add(businesses);
        }
        return byOwnLastName;
    }

    @Override
    public boolean create(int userId, String businessName, String businessCategory, String businessNumber, String city, String majorCity, String stateAbbreviation, String ownerFirstName, String ownerLastName, String ownerPhoneNumber) {
        String sql = "INSERT INTO businesses ( " +
                " business_name, business_category, business_number, " +
                "city, closest_major_city, state_abbreviation, owner_first_name, owner_last_name, owner_phone_number) " +
                "VALUES ( 'test1', 'Computers & Electronics', '412-000-X01', 'Pittsburgh', 'Pittsburgh', 'PA' ,'user', 'name', '412-000-0001') " +
                "returning business_id ";
        SqlRowSet businessId = jdbcTemplate.queryForRowSet(sql, businessName, businessCategory, businessNumber, city, majorCity, stateAbbreviation, ownerFirstName, ownerLastName, ownerPhoneNumber);
        if(businessId != null){
            String sql2 = "INSERT INTO users_businesses (user_id, business_id) VALUES (?, ?)";
            return jdbcTemplate.update(sql2, userId, businessId) == 1;

        }
        return false;
    }

    private Business mapRowToBusiness(SqlRowSet rowSet){
        Business business = new Business();
        business.setId(rowSet.getInt("business_id"));
        business.setBusinessName(rowSet.getString("business_name"));
        business.setBusinessCategory(rowSet.getString("business_category"));
        business.setBusinessNumber(rowSet.getString("business_number"));
        business.setCity(rowSet.getString("city"));
        business.setClosestMajorCity(rowSet.getString("closest_major_city"));
        business.setStateAbbreviation(rowSet.getString("state_abbreviation"));
        business.setOwnerFirstName(rowSet.getString("owner_first_name"));
        business.setOwnerLastName(rowSet.getString("owner_last_name"));
        business.setOwnerPhoneNumber(rowSet.getString("owner_phone_number"));

        return business;
    }
}
