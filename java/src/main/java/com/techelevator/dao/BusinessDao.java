package com.techelevator.dao;

import com.techelevator.model.Business;
import com.techelevator.model.BusinessDto;

import java.util.List;

public interface BusinessDao {

    List<BusinessDto> displayAll();

    List<BusinessDto> findUserOwnedBusinesses(int userId);

    List<BusinessDto> findByCategory(String businessCategory);

    BusinessDto findByBusinessName(String businessName);

    List<BusinessDto> listByMajorCityName(String majorCity);

    List<BusinessDto> findByOwnerFirst(String ownerFirstName);

    List<BusinessDto> findByOwnerLast(String ownerLastName);



    boolean create(int userId, String businessName, String businessCategory, String businessNumber,
                   String city, String majorCity, String stateAbbreviation,
                   String ownerFirstName, String ownerLastName, String ownerPhoneNumber);
}
