package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("---- Bienvenue dans le logiciel du groupe Laspitau ----\n");
        System.out.println("Choisissez votre option :");
        System.out.println("1 : Administration ");
        System.out.println("2 : Entertainment");
        System.out.println("3 : Ajouter une musique");
        System.out.println("4 : Voir playlist");
        int input = scanner.nextInt();
        try{
            switch (input){
                case 1:
                    System.out.println("\n -- Administration du groupe -- \n");
                    System.out.println("Choisissez votre option :");
                    System.out.println("1 : Ajouter Patient");
                    System.out.println("2 : Ajouter Hopital");
                    input = scanner.nextInt();
                    switch (input){
                        case 1:
                            Patient.addPatient();
                            break;
                        case 2:
                            Hopital.addHopital();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("EN CONSTRUCTION");
                    break;
                case 3:
                    boolean ajoutMusique = false;
                    while (ajoutMusique == false){
                    List<Musique> listeMusique = new LinkedList<>();
                    Scanner scannerMusique = new Scanner(System.in);
                    System.out.println("nom artiste");
                    String nomArtiste = scannerMusique.nextLine();
                    System.out.println("nom musique");
                    String nomMusique = scannerMusique.nextLine();
                    Musique musique1 = new Musique(nomMusique, nomArtiste);
                    listeMusique.add(musique1);
                    Playlist playlist = new Playlist(nomArtiste + "--->",listeMusique);
                    playlist.afficherPlaylist();
                    System.out.println("Voulez-vous quitter ?(Y/N)");
                    String reponse = scannerMusique.nextLine();
                        if (reponse.equals("Y")) {
                            playlist.afficherPlaylist();
                            ajoutMusique = true;
                        }
                        }
                    break;
                case 4:
                    System.out.println("nom playlist");
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
