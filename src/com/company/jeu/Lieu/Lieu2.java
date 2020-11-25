package com.company.jeu.Lieu;

import com.company.jeu.Direction;

public class Lieu2 {
    public static void Lieu2() {
        System.out.println(" Vous êtes tout en haut d’une colline qui surplombe la ville, au loin vous voyez une ombre\n" +
                "se déplacer a grande vitesse avec un grand couteau.  ");
        System.out.println("Chossissez la direction : Nord");
        Direction.Direction(s);
        if (s.equal("NORD")) {
            Lieu5;
        }
    }
}