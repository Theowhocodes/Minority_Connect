package com.techelevator.model;

import com.fasterxml.jackson.annotation.JsonProperty;

//currently unused
public class BusinessDto {
    @JsonProperty("business_id")
    private String id;

    @JsonProperty("business_name")
    private String businessName;

    @JsonProperty("business_category")
    private String businessCategory;

    @JsonProperty("business_number")
    private String businessNumber;

    private String city;

    @JsonProperty("closest_major_city")
    private String closestMajorCity;



    //constructor
    public BusinessDto(String id, String businessName, String businessCategory, String businessNumber) {
        this.id = id;
        this.businessName = businessName;
        this.businessCategory = businessCategory;
        this.businessNumber = businessNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
}