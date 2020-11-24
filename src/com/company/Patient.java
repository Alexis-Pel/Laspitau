package com.company;

public class Patient {
    private String numSecu;
    private String name;
    private String lastName;
    private String adress;
    private String phoneNumber;
    private String email;

    public Patient(String numSecu, String name, String lastName, String adress, String phoneNumber, String email) {
        this.numSecu = numSecu;
        this.name = name;
        this.lastName = lastName;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getNumSecu() {
        return numSecu;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAdress() {
        return adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
}
