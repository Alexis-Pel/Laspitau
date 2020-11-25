package com.company;
import java.util.LinkedList;
import java.util.List;

public class Musique {

    private String nomMusique;
    private String nomArtiste;

    public Musique(String nomMusique, String nomArtiste) {
        this.nomMusique = nomMusique;
        this.nomArtiste = nomArtiste;
    }

    public String getNomMusique() {
        return nomMusique;
    }

    public String getNomArtiste() {
        return nomArtiste;
    }
}
