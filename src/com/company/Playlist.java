package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Playlist {
    private String nomPlaylist;
    public static List<Playlist> listePlaylists = new ArrayList<>();
    public static int actualPlaylist = 0;


    public Playlist(String nomPlaylist) {
        this.nomPlaylist = nomPlaylist;
    }


    public static void addPlaylsit() {
        System.out.println("Ajouter combiens de playlists ?");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for (int i = 0; i < input; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Nom de la playlist:");
            String namePlaylist = scanner1.nextLine();
            Playlist playlist = new Playlist(namePlaylist);
            listePlaylists.add(playlist);
        }
    }

    public static void changePlaylist(){
        int nombrePlaylist = listePlaylists.size();
        System.out.println("Il y a " + nombrePlaylist + " Plalists disponibles :");
        int a = 1;
        for (int i = 0; i < nombrePlaylist; i++) {
            System.out.println(a + " : " + listePlaylists.get(i).getNomPlaylist());
            a++;
        }
        System.out.println("Choisissez la playlist :");
        Scanner scanner1 = new Scanner(System.in);
        int input1 = scanner1.nextInt();
        System.out.println("Vous avez choisis " + listePlaylists.get(input1 - 1).getNomPlaylist());
        actualPlaylist = input1 - 1;
    }

    public String getNomPlaylist() {
        return nomPlaylist;
    }
}
