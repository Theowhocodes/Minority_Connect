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



    boolean create(int userId, String businessName, String businessCategory, String businessNumber,
                   String city, String majorCity, String stateAbbreviation,
                   String ownerFirstName, String ownerLastName, String ownerPhoneNumber);
}
