package com.csc340.jpacruddemo.AddRemoveGyms;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Gym entity representing a gym in the application.
 */
@Entity
@Table(name = "Gyms")
@NoArgsConstructor
@Getter
@Setter
public class AddRemoveGyms {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(length = 500)
    private String description;

    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String country;

    private String contactNumber;
    private String emailAddress;

    public AddRemoveGyms(long id, String name, String description, String address, String city, String state, String zipCode, String country, String contactNumber, String emailAddress) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
        this.contactNumber = contactNumber;
        this.emailAddress = emailAddress;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}