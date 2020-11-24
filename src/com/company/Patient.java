package com.company;

import java.util.Scanner;

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

    public static void addPatient(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numéro de Sécurité Sociale :");
        String secu = scanner.nextLine();
        System.out.println("Nom : ");
        String lastName = scanner.nextLine();
        System.out.println("Prénom :");
        String name = scanner.nextLine();
        System.out.println("Adresse :");
        String adress = scanner.nextLine();
        System.out.println("Numéro de téléphone :");
        String phoneNumber = scanner.nextLine();
        System.out.println("Email :");
        String email = scanner.nextLine();
        Patient patient = new Patient(secu, lastName, name, adress, phoneNumber, email);
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
