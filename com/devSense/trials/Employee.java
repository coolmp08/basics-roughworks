package com.devSense.trials;


import java.util.List;

public class Employee {

    private int id;
    private int employeeId;

    private String name;

    private List<String> skillSet;

    private Address address;

    public Employee(int i, String manas, List<String> skillset) {
    }

    public Employee(int id, int employeeId, String name, List<String> skillSet) {
        this.id = id;
        this.employeeId = employeeId;
        this.name = name;
        this.skillSet = skillSet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Employee(int id, int employeeId, String name, List<String> skillSet, Address address) {
        this.id = id;
        this.employeeId = employeeId;
        this.name = name;
        this.skillSet = skillSet;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSkillSet() {
        return skillSet;
    }

    public void setSkillSet(List<String> skillSet) {
        this.skillSet = skillSet;
    }
}
