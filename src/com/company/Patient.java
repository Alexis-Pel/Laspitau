package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Patient {
    private String numSecu;
    private String name;
    private String lastName;
    private String adress;
    private String phoneNumber;
    private String email;
    private int whichHospital;
    public static List<Patient> listePatients = new ArrayList<>();

    /***
     * Constructeur du Patient
     * @param numSecu Le numéro de Sécurité Sociale
     * @param name Le prénom du Patient
     * @param lastName Le nom du patient
     * @param adress L'adresse du patient
     * @param phoneNumber Le numéro de téléphone du patient
     * @param email L'email du patient
     */
    public Patient(String numSecu, String name, String lastName, String adress, String phoneNumber, String email){
        this.numSecu = numSecu;
        this.name = name;
        this.lastName = lastName;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.whichHospital = Hopital.actuelHopital;
    }

    /***
     * Permet D'ajouter un patient
     */
    public static void addPatient(){
        try{
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
            listePatients.add(patient);
            System.out.println("Ajouter un autre patient ? O / N");
            String input = scanner.next();
            switch (input){
                case "O":
                    addPatient();
                    break;
                case "N":
                    Menu.menu();
                    break;
            }
        } catch (Exception e) {
            System.out.println("Erreur, veuillez réessayer");
            addPatient();
        }
    }

    /***
     * Permet de retirer un patient
     */
    public static void retirerPatient(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer le numéro de Sécurité Sociale du patient à retirer :");
        String input = scanner.nextLine();
        try{
            for (int i = 0; i < listePatients.size(); i++) {
                if (listePatients.get(i).numSecu.equals(input)){
                    listePatients.remove(i);
                    System.out.println(" Patient supprimé avec succès\n");
                }
            }
        } catch (Exception e) {
            System.out.println("Erreur, veuillez réessayer");
            retirerPatient();
        }
    }

    /***
     * Affiche les Patients
     */
    public static void showPatient(){
        if(listePatients.isEmpty()){
            System.out.println("Veuillez ajouter des patients\n");
            Menu.menu();
        }
        for (int i = 0; i < listePatients.size(); i++) {
            int hospital = listePatients.get(i).whichHospital;
            if(hospital == Hopital.actuelHopital){
                System.out.println(listePatients.get(i).getName() + " " + listePatients.get(i).getLastName() + " Sécu : " + listePatients.get(i).getNumSecu());
            }
        }
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

    public int getWhichHospital() {
        return whichHospital;
    }
}
