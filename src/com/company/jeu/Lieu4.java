package com.company.jeu;

import com.company.Logger;
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
                Logger log = new Logger("Vous avez prit la direction de l'Ouest");
                Lieu2.Lieu2();

            }else if(Dir.equals("NORD") || Dir.equals("nord")){
                Logger log = new Logger("Vous avez prit la direction du Nord");
                Lieu1.Lieu1();

            }else if (Dir.equals("Q") || Dir.equals("q")){
                Logger log = new Logger("Vous avez quitter la partie");
                Menu.menu();

            }
            else{
                System.out.println("Erreur, veuillez réessayer");
                Logger log = new Logger("Vous avez commis une erreur");
                Lieu4();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
