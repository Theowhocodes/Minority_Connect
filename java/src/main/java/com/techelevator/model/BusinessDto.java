package com.techelevator.model;

import com.fasterxml.jackson.annotation.JsonProperty;
//currently unused

public class BusinessDto {
    @JsonProperty("business_id")
    private int id;

    @JsonProperty("business_name")
    private String businessName;

    @JsonProperty("business_category")
    private String businessCategory;

    @JsonProperty("business_number")
    private String businessNumber;

    private String city;

    @JsonProperty("closest_major_city")
    private String closestMajorCity;

    @JsonProperty("state_abbreviation")
    private String stateAbbreviation;

    @JsonProperty("owner_first_name")
    private String ownerFirstName;

    @JsonProperty("owner_last_name")
    private String ownerLastName;

    @JsonProperty("owner_phone_number")
    private String ownerPhoneNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessCategory() {
        return businessCategory;
    }

    public void setBusinessCategory(String businessCategory) {
        this.businessCategory = businessCategory;
    }

    public String getBusinessNumber() {
        return businessNumber;
    }

    public void setBusinessNumber(String businessNumber) {
        this.businessNumber = businessNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getClosestMajorCity() {
        return closestMajorCity;
    }

    public void setClosestMajorCity(String closestMajorCity) {
        this.closestMajorCity = closestMajorCity;
    }

    public String getStateAbbreviation() {
        return stateAbbreviation;
    }

    public void setStateAbbreviation(String stateAbbreviation) {
        this.stateAbbreviation = stateAbbreviation;
    }

    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    public void setOwnerFirstName(String ownerFirstName) {
        this.ownerFirstName = ownerFirstName;
    }

    public String getOwnerLastName() {
        return ownerLastName;
    }

    public void setOwnerLastName(String ownerLastName) {
        this.ownerLastName = ownerLastName;
    }

    public String getOwnerPhoneNumber() {
        return ownerPhoneNumber;
    }

    public void setOwnerPhoneNumber(String ownerPhoneNumber) {
        this.ownerPhoneNumber = ownerPhoneNumber;
    }
}