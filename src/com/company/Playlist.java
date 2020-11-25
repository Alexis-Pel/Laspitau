package com.company;

import java.util.LinkedList;
import java.util.List;

public class Playlist {
    private String nomPlaylist;
    private List<Musique> listeMusique = new LinkedList<>();

    public Playlist(String nomPlaylist, List<Musique> listeMusique) {
        this.nomPlaylist = nomPlaylist;
        this.listeMusique = listeMusique;
    }

    public String getNomPlaylist() {
        return nomPlaylist;
    }

    public List<Musique> getListeMusique() {
        return listeMusique;
    }

    public void afficherPlaylist(){
        for (Musique musique:this.listeMusique){
            System.out.println(musique.getNomArtiste() + " " + musique.getNomMusique());
        }
    }

    public void ajouterMusique(Musique musique){
        this.listeMusique.add(musique);
    }
}
