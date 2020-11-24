package com.company;

import java.util.Scanner;

public class Menu {
    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("---- Bienvenue dans le logiciel du groupe Laspitau ----\n");
        System.out.println("Choisissez votre option :");
        System.out.println("1 : Ajouter Patient ");
        int input = scanner.nextInt();
        try{
            switch (input){
                case 1:
                    addPatient();
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
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
}
