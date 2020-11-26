package com.company.jeu;

import com.company.Main;
import com.company.Menu;

import java.util.Scanner;

public class Lieu4 {
    public static void Lieu4() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vous êtes dans une vallée a coté d’un ruisseau. Un corps flotte là dans l’eau.");
        System.out.println("Chossissez la direction que vous souhaitez prendre : OUEST, NORD");
        String Dir = scanner.nextLine();
        if (Dir.equals("OUEST")) {
            Lieu2.Lieu2();
        }else if(Dir.equals("NORD")){
            Lieu1.Lieu1();
        }else if (Dir.equals("Q")){
            Menu.menu();
        }
    }
}
