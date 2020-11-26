package com.company.jeu;

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
                Lieu1.Lieu1();
            }else if (Dir.equals("Q") || Dir.equals("q")){
                Menu.menu();
            }
            else{
                System.out.println("Erreur, veuillez réessayer");
                Lieu5();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
