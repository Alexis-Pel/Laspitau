package com.company.jeu;

import com.company.Logger;
import com.company.Menu;

import com.company.Menu;

import java.util.Scanner;

public class Lieu5 {
    public static void Lieu5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\nVous êtes dans la foret noire. Vous entendez des hurlements stridents.\n");
        System.out.println("Chossissez la direction que vous souhaitez prendre : SUD");
        try{
            String Dir = scanner.nextLine();
            if (Dir.equals("SUD") || Dir.equals("sud")) {
                Logger log = new Logger("Vous avez prit la direction du Sud");
                Lieu1.Lieu1();

            }else if (Dir.equals("Q") || Dir.equals("q")){
                Logger log = new Logger("Vous avez quitter la partie");
                Menu.menu();
            }
            else{
                System.out.println("Erreur, veuillez réessayer");
                Logger log = new Logger("Vous avez commis une erreur");
                Lieu5();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
