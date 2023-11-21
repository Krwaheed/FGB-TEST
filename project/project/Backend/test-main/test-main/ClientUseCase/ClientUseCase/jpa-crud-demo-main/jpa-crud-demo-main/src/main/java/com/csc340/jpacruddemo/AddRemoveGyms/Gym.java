package com.csc340.jpacruddemo.AddRemoveGyms;

import lombok.Value;

import java.io.Serializable;


@Value
public class Gym extends AddRemoveGyms implements Serializable {
    long id;
    String name;
    String description;
    String address;
    String city;
    String state;
    String zipCode;
    String country;
    String emailAddress;
}