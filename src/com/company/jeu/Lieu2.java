package com.company.jeu;

import com.company.Logger;
import com.company.Menu;

import java.util.List;
import java.util.Scanner;

public class Lieu2 {
    public static void Lieu2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\nVous êtes tout en haut d’une colline qui surplombe la ville, au loin vous voyez une ombre\n" +
                "se déplacer a grande vitesse avec un grand couteau.\n");
        System.out.println("Chossissez la direction que vous souhaitez prendre : NORD");
        try {
            String Dir = scanner.nextLine();
            if(Dir.equals("NORD") ||Dir.equals("nord")){
                Logger log = new Logger("Vous avez prit la direction du Nord");
                Lieu5.Lieu5();

            }else if (Dir.equals("Q") || Dir.equals("q")){
                Logger log = new Logger("Vous avez quitter la partie");
                Menu.menu();

            }
            else{
                System.out.println("Erreur, veuillez réessayer");
                Logger log = new Logger("Vous avez commis une erreur");
                Lieu2();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
