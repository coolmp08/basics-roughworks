package com.devSense.reflection;

public class Company {

    private String name;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void displayName() {
        System.out.println("Private method invoked to display the company name: " + name);
    }
}
