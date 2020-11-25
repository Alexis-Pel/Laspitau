package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Praticien {
    private String matriculNumber;
    private String LastName;
    private String name;
    private String special;
    private String grade;
    private int whichHospital;
    private int price;
    public static List<Praticien> listePraticien = new ArrayList<>();

    public Praticien(String matriculNumber, String lastName, String name, String special, String grade, int whichHospital, int price) {
        this.matriculNumber = matriculNumber;
        this.LastName = lastName;
        this.name = name;
        this.special = special;
        this.grade = grade;
        this.whichHospital = whichHospital;
        this.price = price;
    }
    public static void addPraticien() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numéro de Matricule :");
        String matricule = scanner.nextLine();
        System.out.println("Nom : ");
        String lastName = scanner.nextLine();
        System.out.println("Prénom :");
        String name = scanner.nextLine();
        System.out.println("Spécialitée : ");
        String spec = scanner.nextLine();
        System.out.println("Grade :");
        String grade = scanner.nextLine();
        System.out.println("Tarif Honoraire : ");
        int price = scanner.nextInt();
        Praticien praticien = new Praticien(matricule, lastName, name, spec, grade, Hopital.actuelHopital, price);
        listePraticien.add(praticien);
        System.out.println("Ajouter un autre praticien ? O / N");
        String input = scanner.next();
        switch (input) {
            case "O":
                addPraticien();
                break;
            case "N":
                Menu.menu();
                break;
        }
    }

    public String getMatriculNumber() {
        return matriculNumber;
    }

    public String getLastName() {
        return LastName;
    }

    public String getName() {
        return name;
    }

    public String getSpecial() {
        return special;
    }

    public String getGrade() {
        return grade;
    }

    public int getWhichHospital() {
        return whichHospital;
    }

    public int getPrice() {
        return price;
    }
}
