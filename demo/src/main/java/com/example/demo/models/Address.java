package com.example.demo.models;

import javax.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue

    private Long id;
    private String addressLine1;
    private String addressLine2;
    private String apartmentNumber;
    private String city;
    private String state;
    private String zipCode;
    private String zipPlusFour;
    private String county;
    private String country;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    private Employee employeeName;

    public Long getId() {
        return id;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getZipPlusFour() {
        return zipPlusFour;
    }

    public String getCounty() {
        return county;
    }

    public String getCountry() {
        return country;
    }

    public Address(String addressLine1, String addressLine2, String apartmentNumber, String city, String state, String zipCode, String zipPlusFour, String county, String country, Employee employeeName) {
        this.employeeName = employeeName;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.apartmentNumber = apartmentNumber;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.zipPlusFour = zipPlusFour;
        this.county = county;
        this.country = country;
    }

    public Address() {
    }
}
