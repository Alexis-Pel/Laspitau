package com.company;

import java.util.*;

public class Musique {

    private String nomMusique;
    private String nomArtiste;
    private int whichPlaylist;
    public static List<Musique> listeMusique = new ArrayList<>();
    public static int actualMusic = 0;


    /***
     * Constructeur d'un Hopital
     * @param nomMusique Le nom de la Musique
     * @param nomArtiste Le nom de l'Artiste$
     */
    public Musique(String nomMusique, String nomArtiste) {
        this.nomMusique = nomMusique;
        this.nomArtiste = nomArtiste;
        this.whichPlaylist = Playlist.actualPlaylist;
    }

    /***
     * Permet d'ajouter une Musique
     */
    public static void addMusique() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nom de la Musique :");
        String nomMusique = scanner.nextLine();
        System.out.println("Nom de l'Artiste : ");
        String nomArtiste = scanner.nextLine();
        Musique musique = new Musique(nomMusique, nomArtiste);
        listeMusique.add(musique);
        System.out.println("Ajouter une autre Musique ? O / N");
        String input = scanner.next();
        switch (input) {
            case "O":
                addMusique();
                break;
            case "N":
                Menu.menu();
                break;
        }
        Menu.menu();
    }

    /***
     * Permet de retirer une Musique
     */
    public static void retirerMusique() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer le nom de la musique à retirer :");
        String input = scanner.nextLine();
        try {
            for (int i = 0; i < listeMusique.size(); i++) {
                if (listeMusique.get(i).nomMusique.equals(input)) {
                    listeMusique.remove(i);
                    System.out.println(" Musique supprimé avec succès\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Menu.menu();
    }

    /***
     * Permet de montrer les Musiques de la playlist
     */
    public static void showMusique() {
        if (listeMusique.isEmpty()) {
            System.out.println("Veuillez ajouter des musiques\n");
            Menu.menu();
        }
        for (int i = 0; i < listeMusique.size(); i++) {
            int playlist = listeMusique.get(i).whichPlaylist;
            if (playlist == Playlist.actualPlaylist) {
                System.out.println(listeMusique.get(i).getNomMusique() + " DE " + listeMusique.get(i).getNomArtiste());
            }
        }
        Menu.menu();
    }

    /***
     * Permet de passer à la musique suivante
     */
    public static void changerPlusMusique(){
        if(actualMusic == listeMusique.size()-1){
            actualMusic = 0;
            showActualMusique();
        }
        else{
            actualMusic += 1;
            showActualMusique();
        }

   }

    /***
     * Permet de passer a la musique précédente
     */
   public static void changerMoinsMusique(){
        if (actualMusic <= 0){
            actualMusic = listeMusique.size() - 1;
        }
        else {
            actualMusic -= 1;
            showActualMusique();
        }
    }

    /***
     * Permet d'afficher la Musique en cours d'écoute
     */
    public static void showActualMusique() {
        System.out.println(listeMusique.get(actualMusic).getNomMusique());
    }


    public String getNomMusique() {
        return nomMusique;
    }

    public String getNomArtiste() {
        return nomArtiste;
    }
}
