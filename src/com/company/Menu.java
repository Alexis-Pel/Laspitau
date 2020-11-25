package com.company;

import java.util.Scanner;

public class Menu {
    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("---- Bienvenue dans le logiciel du groupe Laspitau ----\n");
        System.out.println("Choisissez votre option :");
        System.out.println("1 : Administration ");
        System.out.println("2 : Entertainment");
        int input = scanner.nextInt();
        try{
            switch (input){
                case 1:
                    System.out.println("\n -- Administration du groupe -- \n");
                    System.out.println("Choisissez votre option :");
                    System.out.println("1 : Ajouter Patient");
                    System.out.println("2 : Ajouter Hopital");
                    input = scanner.nextInt();
                    switch (input){
                        case 1:
                            Patient.addPatient();
                            break;
                        case 2:
                            Hopital.addHopital();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("EN CONSTRUCTION");
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
