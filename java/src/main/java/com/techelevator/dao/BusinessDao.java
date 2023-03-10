package com.techelevator.dao;

import com.techelevator.model.Business;

import java.util.List;

public interface BusinessDao {

    List<Business> displayAll();

    List<Business> findUserOwnedBusinesses(int userId);

    List<Business> findByCategory(String businessCategory);

    Business findByBusinessName(String businessName);

    List<Business> listByMajorCityName(String majorCity);

    List<Business> findByOwnerFirst(String ownerFirstName);

    List<Business> findByOwnerLast(String ownerLastName);
    List<Business> userOwnedBusinesses(int userId);



    boolean create(String businessName, String businessNumber,
                   String city, String majorCity, String stateAbbreviation,
                   String ownerFirstName, String ownerLastName, String ownerPhoneNumber);
}
