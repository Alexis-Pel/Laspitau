package com.company;
import java.util.LinkedList;
import java.util.List;

public class Semaine {
    public static List Jours = new LinkedList<>();
    public static List Horaire = new LinkedList<>();

    /***
     * Permet de créer les jours de travail
     * @return Les jours contenant les horaires
     */
    public static List createDays(){
        for (int i = 0; i < 2; i++) {
            Horaire.clear();
            for (int a = 0; a < 7; a++) {
                Horaire.add(9+a + "H");
            }
            Jours.add(Horaire);
        }
        return Jours;
    }
}
