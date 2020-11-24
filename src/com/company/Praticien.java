package com.company;

public class Praticien {
    private String matriculNumber;
    private String LastName;
    private String name;
    private String special;
    private String grade;
    private String whichHospital;
    private int price;

    public Praticien(String matriculNumber, String lastName, String name, String special, String grade, String whichHospital, int price) {
        this.matriculNumber = matriculNumber;
        LastName = lastName;
        this.name = name;
        this.special = special;
        this.grade = grade;
        this.whichHospital = whichHospital;
        this.price = price;
    }
}
