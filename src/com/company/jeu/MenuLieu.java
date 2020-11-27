package com.company.jeu;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class MenuLieu {

    /***
     * L'introduction du jeu
     */
    public static void menuLieu() throws FileNotFoundException, UnsupportedEncodingException {
        System.out.println("Vous êtes chez vous devant votre ordinateur en plein cours Java.");
        System.out.println("Vous fermez les yeux et soudainement :");
        System.out.println("..........................................................................");
        Lieu1.Lieu1();
    }
}

