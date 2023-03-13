package com.techelevator.model;

import java.util.Objects;

public class Business {

    private int id;
    private String businessName;
    private String city;
    private String stateAbbreviation;
    private String businessNumber;
    private String ownerFirstName;
    private String ownerLastName;
    private String ownerPhoneNumber;

    public Business(int id, String businessName, String city, String stateAbbreviation, String businessNumber, String ownerFirstName, String ownerLastName, String ownerPhoneNumber) {
        this.id = id;
        this.businessName = businessName;
        this.city = city;
        this.stateAbbreviation = stateAbbreviation;
        this.businessNumber = businessNumber;
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

    public int hashCode(){
        return Objects.hash(id, businessName, city, stateAbbreviation, businessNumber, ownerFirstName, ownerLastName, ownerPhoneNumber);
    }

    @Override
    public String toString() {
        return "Business{" +
                "id=" + id +
                ", business_name='" + businessName + '\'' +
                ", city=" + city +
                ", state_abbreviation=" + stateAbbreviation +
                ", business_number=" + businessNumber +
                ", owner_first_name=" + ownerFirstName +
                ", owner_last_name=" + ownerLastName +
                ", owner_phone_number=" + ownerPhoneNumber +
                '}';
    }
}
