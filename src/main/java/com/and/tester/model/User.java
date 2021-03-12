package com.and.tester.model;

import java.io.Serializable;

public class User implements Serializable {
    private String firstName;
    private String middleName;
    private String lastName;
    private final int age;

    public User() {
        this.age = -1;
    }

    public User(String firstName, String middleName, String lastName, int age) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
