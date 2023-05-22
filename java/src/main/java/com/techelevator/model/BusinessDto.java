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

    @JsonProperty("closest_major_city")
    private String closestMajorCity;

    @JsonProperty("state_abbreviation")
    private String stateAbbreviation;


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

}