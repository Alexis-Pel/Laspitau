package com.company;

import com.company.jeu.MenuLieu;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    /***
     * Le menu de navigation
     */
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
                    System.out.println("1 : Gestion Hôpital");
                    System.out.println("2 : Gestion Patient");
                    System.out.println("3 : Gestion Praticien");
                    System.out.println("4 : Gestion Médicament");
                    input = scanner.nextInt();
                    switch (input) {
                        case 1:
                            System.out.println("Choisissez votre option : \n");
                            System.out.println("1 : Changer Hopital");
                            System.out.println("2 : Ajouter Hopital");
                            input = scanner.nextInt();
                            switch (input) {
                                case 1:
                                    Hopital.changeHospital();
                                    break;
                                case 2:
                                    Hopital.addHopital();
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("Choisissez votre option : ");
                            System.out.println("1 : Ajout d'un Patient");
                            System.out.println("2 : Retirer un Patient");
                            System.out.println("3 : Afficher les Patients");
                            System.out.println("4 : Gestion Rendez-vous");
                            input = scanner.nextInt();
                            switch (input) {
                                case 1:
                                    Patient.addPatient();
                                    break;
                                case 2:
                                    Patient.retirerPatient();
                                    break;
                                case 3:
                                    Patient.showPatient();
                                    break;
                                case 4:
                                    System.out.println("\nChoisissez votre option : ");
                                    System.out.println("1 : Ajout d'un Rendez-Vous");
                                    System.out.println("2 : Voir les Rendez-Vous");
                                    input = scanner.nextInt();
                                    switch (input){
                                        case 1:
                                            Hopital.createRendezVous();
                                            break;
                                        case 2:
                                            System.out.println(Semaine.Jours);
                                            break;
                                    }
                                    break;
                            }
                            menu();
                            break;
                        case 3:
                            System.out.println("Choisissez votre option : ");
                            System.out.println("1 : Ajout d'un Praticien");
                            System.out.println("2 : Retirer un Praticien");
                            System.out.println("3 : Afficher les Praticiens");
                            input = scanner.nextInt();
                            switch (input) {
                                case 1:
                                    Praticien.addPraticien();
                                    break;
                                case 2:
                                    Praticien.retirerPraticien();
                                    break;
                                case 3:
                                    Praticien.showPraticien();
                                    break;
                            }
                        case 4:
                            System.out.println("Choisissez votre option : ");
                            System.out.println("1 : Ajout de Médicaments");
                            System.out.println("2 : Afficher les Médicaments");
                            input = scanner.nextInt();
                            switch (input) {
                                case 1:
                                    Medicament.addMedicament();
                                    break;
                                case 2:
                                    Medicament.showMedicament();
                            }
                    }
                    break;
                case 2:
                    System.out.println("\n1 : Ajouter musique");
                    System.out.println("2 : Mini-jeu");
                    input = scanner.nextInt();
                    switch (input){
                        case 1 :
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
                                //Playlist playlist = new Playlist(nomArtiste + "--->",listeMusique);
                                //playlist.afficherPlaylist();
                                System.out.println("Voulez-vous quitter ?(Y/N)");
                                String reponse = scannerMusique.nextLine();
                                if (reponse.equals("Y")) {
                                //    playlist.afficherPlaylist();
                                    ajoutMusique = true;
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Le jeu va bientôt commencer, êtes-vous pret ? (Y/N)");
                            String reponse = scanner.next();
                            if (reponse.equals("Y")) {
                                MenuLieu.menuLieu();
                            }else if (reponse.equals("N"));
                            Menu.menu();
                            break;


                    }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
