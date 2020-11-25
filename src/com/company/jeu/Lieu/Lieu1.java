package com.company.jeu.Lieu;

import com.company.jeu.Direction;

public class Lieu1 {

    public static void Lieu1(){
        System.out.println("Vous êtes au bout de la route devant un petit immeuble en brique. Un petit ruisseau coule\n" +
                "a côté du building en bas d’une rigole. ");
        System.out.println("Chossissez la direction : Nord, Sud, Est ou Ouest");
        Direction.Direction("s");
        if(s.equal("NORD")){
            Lieu5;
        }else if (s.equal("SUD")){
            Lieu4;
        }else if (s.equal("OUEST")){
            Lieu2;
        }else if (s.equal("EAST")){
            Lieu3;
        }
    }
}
