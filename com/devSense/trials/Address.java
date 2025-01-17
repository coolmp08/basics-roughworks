package com.devSense.trials;

public class Address {

    private String city;
    private String addressLine1;
    private String addressLine2;
    private int PIN;
    private String state;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", PIN=" + PIN +
                ", state='" + state + '\'' +
                '}';
    }

    public Address() {
    }

    public Address(String city, String addressLine1, String addressLine2, int PIN, String state) {
        this.city = city;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.PIN = PIN;
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public int getPIN() {
        return PIN;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Address(String city, String addressLine1, String addressLine2, int PIN) {
        this.city = city;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.PIN = PIN;
    }
}
