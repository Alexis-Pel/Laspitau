package com.company;

public class Medicament {
    private String ISNCode;
    private String nomenclature;
    private String description;
    private int quantityAvailable;
    private String dateOfPrescription;
    private int Price;

    public Medicament(String ISNCode, String nomenclature, String description, int quantityAvailable, String dateOfPrescription, int price) {
        this.ISNCode = ISNCode;
        this.nomenclature = nomenclature;
        this.description = description;
        this.quantityAvailable = quantityAvailable;
        this.dateOfPrescription = dateOfPrescription;
        Price = price;
    }
}
