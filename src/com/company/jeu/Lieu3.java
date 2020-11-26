package com.company.jeu;

import com.company.Menu;

import java.util.Scanner;

public class Lieu3 {
    public static void Lieu3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vous êtes a l’intérieur d’un building en brique, un petit refuge pour les bêtes. Un homme\n" +
                "git là au milieu d’une marre de sang.");
        System.out.println("Chossissez la direction que vous souhaitez prendre : OUEST");
        String Dir = scanner.nextLine();
        if (Dir.equals("OUEST")) {
            Lieu1.Lieu1();
        }else if (Dir.equals("Q")){
            Menu.menu();
        }
    }
}
