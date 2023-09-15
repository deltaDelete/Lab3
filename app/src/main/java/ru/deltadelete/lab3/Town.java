package ru.deltadelete.lab3;

import com.github.javafaker.Address;

public class Town {
    private int id;
    private String name;
    private String country;

    public Town(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public static Town fromFakerAddress(Address address) {
        return new Town(address.city(), address.country());
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
