package com.company.jeu;

import com.company.Logger;
import com.company.Menu;

import java.util.Scanner;

public class Lieu3 {
    public static void Lieu3()  {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\nVous êtes a l’intérieur d’un building en brique, un petit refuge pour les bêtes. Un homme\n" +
                "git là au milieu d’une marre de sang.\n");
        System.out.println("Chossissez la direction que vous souhaitez prendre : OUEST");
        try{
            String Dir = scanner.nextLine();
            if (Dir.equals("OUEST") || Dir.equals("ouest")) {
                Logger log = new Logger("Vous avez prit la direction de l'Ouest");
                Lieu1.Lieu1();

            }else if (Dir.equals("Q") || Dir.equals("q")){
                Logger log = new Logger("Vous avez quitter la partie");
                Menu.menu();
            }
            else{
                System.out.println("Erreur, veuillez réessayer");
                Logger log = new Logger("Vous avez commis une erreur");
                Lieu3();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
