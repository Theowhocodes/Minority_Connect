package com.techelevator.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Business {

    private int id;

    private String businessName;


    private String businessCategory;

    private String businessNumber;
    private String city;


    private String closestMajorCity;

    private String stateAbbreviation;


    private String ownerFirstName;


    private String ownerLastName;


    private String ownerPhoneNumber;

    public Business() {}
    public Business(int id, String businessName, String businessCategory, String businessNumber,
                    String city, String closestMajorCity, String stateAbbreviation, String ownerFirstName,
                    String ownerLastName, String ownerPhoneNumber) {
        this.id = id;
        this.businessName = businessName;
        this.businessCategory = businessCategory;
        this.businessNumber = businessNumber;
        this.city = city;
        this.closestMajorCity = closestMajorCity;
        this.stateAbbreviation = stateAbbreviation;
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.ownerPhoneNumber = ownerPhoneNumber;
    }

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateAbbreviation() {
        return stateAbbreviation;
    }

    public void setStateAbbreviation(String stateAbbreviation) {
        this.stateAbbreviation = stateAbbreviation;
    }

    public String getBusinessNumber() {
        return businessNumber;
    }

    public void setBusinessNumber(String businessNumber) {
        this.businessNumber = businessNumber;
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

    public String getBusinessCategory() {
        return businessCategory;
    }

    public void setBusinessCategory(String businessCategory) {
        this.businessCategory = businessCategory;
    }

    public String getClosestMajorCity() {
        return closestMajorCity;
    }

    public void setClosestMajorCity(String closestMajorCity) {
        this.closestMajorCity = closestMajorCity;
    }

    @Override
    public String toString() {
        return "Business{" +
                "id=" + id +
                ", business_Name='" + businessName + '\'' +
                ", businessCategory='" + businessCategory + '\'' +
                ", businessNumber='" + businessNumber + '\'' +
                ", city='" + city + '\'' +
                ", closestMajorCity='" + closestMajorCity + '\'' +
                ", stateAbbreviation='" + stateAbbreviation + '\'' +
                ", ownerFirstName='" + ownerFirstName + '\'' +
                ", ownerLastName='" + ownerLastName + '\'' +
                ", ownerPhoneNumber='" + ownerPhoneNumber + '\'' +
                '}';
    }

    public int hashCode(){
        return Objects.hash(id, businessName, city, stateAbbreviation, businessNumber, ownerFirstName, ownerLastName, ownerPhoneNumber);
    }

}
