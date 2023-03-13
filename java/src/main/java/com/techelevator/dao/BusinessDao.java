package com.techelevator.dao;

import com.techelevator.model.Business;

import java.util.List;

public interface BusinessDao {

    List<Business> displayAll();

    Business findUserOwnedBusinesses(int userId);

    Business findByCategory(String businessCategory);

    Business findByBusinessName(String businessName);

    List<Business> listByMajorCityName(String majorCity);

    List<Business> findByOwnerFirst(String ownerFirstName);

    List<Business> findByOwnerLast(String ownerLastName);
    

    boolean create(String businessName, String businessNumber,
                   String city, String majorCity, String stateAbbreviation,
                   String ownerFirstName, String ownerLastName, String ownerPhoneNumber);
}
