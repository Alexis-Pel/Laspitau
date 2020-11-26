package com.company.jeu;

import com.company.Menu;

import java.util.Scanner;

public class Lieu1 {


    public static void Lieu1(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vous êtes au bout de la route devant un petit immeuble en brique. Un petit ruisseau coule\n" +
                "a côté du building en bas d’une rigole. ");
        System.out.println("Chossissez la direction que vous souhaitez prendre : NORD, SUD, EST ou OUEST");
        String Dir = scanner.nextLine();
        if(Dir.equals("NORD")){
            Lieu5.Lieu5();
        }else if (Dir.equals("SUD")){
            Lieu4.Lieu4();
        }else if (Dir.equals("OUEST")){
            Lieu2.Lieu2();
        }else if (Dir.equals("EST")){
            Lieu3.Lieu3();
        }else if (Dir.equals("Q")){
            Menu.menu();
        }
    }
}
