package org.bootcamp2025_ey.wlad.bootcamp2025_training.model;


import jakarta.persistence.*;

@Entity
public class CustomerAddress extends BaseEntity{

    private String postalCode;
    private String address;
    private String city;

    public CustomerAddress() {
    }

    public CustomerAddress(String postalCode, String address, String city) {
        this.postalCode = postalCode;
        this.address = address;
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
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
}
