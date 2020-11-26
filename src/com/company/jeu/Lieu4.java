package com.company.jeu;

import com.company.Main;
import com.company.Menu;

import java.util.Scanner;

public class Lieu4 {
    public static void Lieu4() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\nVous êtes dans une vallée a coté d’un ruisseau. Un corps flotte là dans l’eau.\n");
        System.out.println("Chossissez la direction que vous souhaitez prendre : OUEST, NORD");
        try{
            String Dir = scanner.nextLine();
            if (Dir.equals("OUEST") || Dir.equals("ouest")) {
                Lieu2.Lieu2();
            }else if(Dir.equals("NORD") || Dir.equals("nord")){
                Lieu1.Lieu1();
            }else if (Dir.equals("Q") || Dir.equals("q")){
                Menu.menu();
            }
            else{
                System.out.println("Erreur, veuillez réessayer");
                Lieu4();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
