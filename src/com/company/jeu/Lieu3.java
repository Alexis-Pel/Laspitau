package com.company.jeu;

import com.company.Menu;

import java.util.Scanner;

public class Lieu3 {
    public static void Lieu3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\nVous êtes a l’intérieur d’un building en brique, un petit refuge pour les bêtes. Un homme\n" +
                "git là au milieu d’une marre de sang.\n");
        System.out.println("Chossissez la direction que vous souhaitez prendre : OUEST");
        try{
            String Dir = scanner.nextLine();
            if (Dir.equals("OUEST") || Dir.equals("ouest")) {
                Lieu1.Lieu1();
            }else if (Dir.equals("Q") || Dir.equals("q")){
                Menu.menu();
            }
            else{
                System.out.println("Erreur, veuillez réessayer");
                Lieu3();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
