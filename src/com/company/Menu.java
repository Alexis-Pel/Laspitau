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
                    Patient.addPatient();
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
}
