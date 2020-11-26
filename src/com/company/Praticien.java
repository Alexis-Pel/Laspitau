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

    /***
     * Constructeur Du Praticien
     * @param matriculNumber Le numéro du matricule
     * @param lastName Le nom
     * @param name Le Prénom
     * @param special La specialité de ce Praticien
     * @param grade Son grade
     * @param whichHospital L'Hôpital auquel il est affecté
     * @param price Le tarif honoraire
     */
    public Praticien(String matriculNumber, String lastName, String name, String special, String grade, int whichHospital, int price) {
        this.matriculNumber = matriculNumber;
        this.LastName = lastName;
        this.name = name;
        this.special = special;
        this.grade = grade;
        this.whichHospital = whichHospital;
        this.price = price;
    }

    /***
     * Permet d'ajouter un Praticien
     */
    public static void addPraticien() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numéro de Matricule :");
        String matricule = scanner.nextLine();
        System.out.println("Nom : ");
        String lastName = scanner.nextLine();
        System.out.println("Prénom :");
        String name = scanner.nextLine();
        System.out.println("Spécialité : ");
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

    /***
     * Permet de retirer un praticien
     */
    public static void retirerPraticien(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer le numéro de Matricule du praticien à retirer :");
        String input = scanner.nextLine();
        try{
            for (int i = 0; i < listePraticien.size(); i++) {
                if (listePraticien.get(i).matriculNumber.equals(input)){
                    listePraticien.remove(i);
                    System.out.println(" Praticien supprimé avec succès\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /***
     * Affiche les praticiens
     */
    public static void showPraticien(){
        if(listePraticien.isEmpty()){
            System.out.println("Veuillez ajouter des praticiens\n");
            Menu.menu();
        }
        for (int i = 0; i < listePraticien.size(); i++) {
            int hospital = listePraticien.get(i).whichHospital;
            if(hospital == Hopital.actuelHopital){
                System.out.println(listePraticien.get(i).getName() + " " + listePraticien.get(i).getLastName() + " Matricule : " + listePraticien.get(i).getMatriculNumber());
            }
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

    public int getPrice() {
        return price;
    }
    public int getWhichHospital(){return whichHospital;}
}
