package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hopital {
    private String name;
    private String adress;
    private String special;
    private int taille;
    public static List<Hopital> listeHopitaux = new ArrayList<>();

    public Hopital(String name, String adress, String special, int taille) {
        this.name = name;
        this.adress = adress;
        this.special = special;
        this.taille = taille;
    }

    public static void addHopital(){
        System.out.println("Ajouter combiens d'Hôpitaux ?");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for (int i = 0; i < input; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Nom de l'hôpital :");
            String name = scanner1.nextLine();
            System.out.println("Adresse de l'hôpital : ");
            String adress = scanner1.nextLine();
            System.out.println("Specialitée de l'Hôpital ( '' )( '' )( '' ) : ");
            String spec = scanner1.nextLine();
            System.out.println("Taille de l'hôpital : ");
            int taille = scanner1.nextInt();
            Hopital hopital = new Hopital(name, adress, spec, taille);
            listeHopitaux.add(hopital);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }
}
