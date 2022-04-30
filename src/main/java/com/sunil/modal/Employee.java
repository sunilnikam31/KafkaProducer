package com.sunil.modal;

public class Employee {
    private String name;
    private String city;
    public String getName() {
        return name;
    }
    public Employee() {
    }
    public String getCity() {
        return city;
    }
    public Employee(String name, String city) {
        this.name = name;
        this.city = city;
    }
}
