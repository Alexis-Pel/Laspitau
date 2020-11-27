package com.company.jeu;

import com.company.Logger;
import com.company.Menu;

import java.util.Scanner;

public class Lieu1 {


    public static void Lieu1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\nVous êtes au bout de la route devant un petit immeuble en brique. Un petit ruisseau coule\n" +
                "a côté du building en bas d’une rigole.\n");
        System.out.println("Chossissez la direction que vous souhaitez prendre : NORD, SUD, EST ou OUEST");
        String Dir = scanner.next();
        try{
            if(Dir.equals("NORD") || Dir.equals("nord")){
                Logger log = new Logger("Vous avez prit la direction du Nord");
                Lieu5.Lieu5();
            }else if (Dir.equals("SUD") || Dir.equals("sud")){
                Logger log = new Logger("Vous avez prit la direction du Sud");
                Lieu4.Lieu4();

            }else if (Dir.equals("OUEST") || Dir.equals("ouest")){
                Logger log = new Logger("Vous avez prit la direction de l'Ouest");
                Lieu2.Lieu2();

            }else if (Dir.equals("EST") || Dir.equals("est")){
                Logger log = new Logger("Vous avez prit la direction de l'Est");
                Lieu3.Lieu3();

            }else if (Dir.equals("Q") || Dir.equals("q")){
                Logger log = new Logger("Vous avez quitter la partie");
                Menu.menu();
            }
            else {
                System.out.println("Erreur, veuillez réessayer\n\n\n");
                Logger log = new Logger("Vous avez commis une erreur");
                Lieu1();
            }

        } catch (Exception e) {
            System.out.println("Erreur, veuillez réessayer\n\n\n");
            Lieu1();
        }

    }
}
