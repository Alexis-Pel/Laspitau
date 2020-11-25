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
        System.out.println("2 : Animation");
        int input = scanner.nextInt();
        try {
            switch (input) {
                case 1:
                    System.out.println("\n -- Administration du groupe -- \n");
                    if (!Hopital.listeHopitaux.isEmpty()){
                        System.out.println(" - Hôpital " + Hopital.listeHopitaux.get(Hopital.actuelHopital).getName() + " -");
                    }
                    System.out.println("Choisissez votre option :");
                    if(Hopital.listeHopitaux.isEmpty()) {
                        System.out.println("1 : Ajouter Hopital");
                        input = scanner.nextInt();
                        switch (input) {
                            case 1:
                                Hopital.addHopital();
                                break;
                        }
                        menu();
                    }
                    System.out.println("1 : Changer d'Hôpital");
                    System.out.println("2 : Ajouter Patient");
                    System.out.println("3 : Ajouter Praticien");
                    input = scanner.nextInt();
                    switch (input) {
                        case 1:
                            Hopital.changeHospital();
                            break;
                        case 2:
                            Patient.addPatient();
                            break;
                        case 3:
                            Praticien.addPraticien();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("1 : Ajouter une musique");
                    System.out.println("2 : Voir playlist");
                    input = scanner.nextInt();
                    switch (input) {
                        case 1:
                            List<Musique> listeMusique = new LinkedList<>();
                            Scanner scannerMusique = new Scanner(System.in);
                            System.out.println("nom artiste");
                            String nomArtiste = scannerMusique.nextLine();
                            System.out.println("nom musique");
                            String nomMusique = scannerMusique.nextLine();
                            Musique musique1 = new Musique(nomMusique, nomArtiste);
                            listeMusique.add(musique1);
                            Musique musique2 = new Musique("balba", "dpuabfa");
                            listeMusique.add(musique2);
                            Playlist playlist = new Playlist(nomArtiste + "--->", listeMusique);
                            playlist.afficherPlaylist();
                            break;
                        case 2:
                            System.out.println("nom playlist");
                            break;
                    }
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
