package com.company.jeu;

import com.company.Menu;

import com.company.Menu;

import java.util.Scanner;

public class Lieu5 {
    public static void Lieu5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vous êtes dans la foret noire. Vous entendez des hurlements stridents.");
        System.out.println("Chossissez la direction que vous souhaitez prendre : SUD");
        String Dir = scanner.nextLine();
        if (Dir.equals("SUD")) {
            Lieu1.Lieu1();
        }else if (Dir.equals("Q")){
            Menu.menu();
        }
    }
}
