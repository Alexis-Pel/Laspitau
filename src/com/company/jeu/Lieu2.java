package com.company.jeu;

import com.company.Menu;

import java.util.Scanner;

public class Lieu2 {
    public static void Lieu2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vous êtes tout en haut d’une colline qui surplombe la ville, au loin vous voyez une ombre\n" +
                "se déplacer a grande vitesse avec un grand couteau. ");
        System.out.println("Chossissez la direction que vous souhaitez prendre : NORD");
        String Dir = scanner.nextLine();
        if(Dir.equals("NORD")){
            Lieu5.Lieu5();
        }else if (Dir.equals("Q")){
            Menu.menu();
        }
    }
}
