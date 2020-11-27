package com.company;
import com.company.jeu.MenuLieu;
import java.util.Collections;
import java.util.Scanner;


public class Menu {
    /***
     * Le menu de navigation
     */
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---- Bienvenue dans le logiciel du groupe Laspitau ----\n");
        System.out.println("Choisissez votre option :");
        System.out.println("1 : Administration ");
        System.out.println("2 : Animation");
        try {
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.println("\n -- Administration du groupe -- \n");
                    if (!Hopital.listeHopitaux.isEmpty()) {
                        System.out.println(" - Hôpital " + Hopital.listeHopitaux.get(Hopital.actuelHopital).getName() + " -");
                    }
                    System.out.println("Choisissez votre option :");
                    if (Hopital.listeHopitaux.isEmpty()) {
                        System.out.println("1 : Ajouter Hopital");
                        try{
                            input = scanner.nextInt();
                            switch (input) {
                                case 1:
                                    Hopital.addHopital();
                                    break;
                            }
                        } catch (Exception e) {
                            System.out.println("Veuillez indiquer une option valide");;
                        }
                        menu();
                    }
                    System.out.println("1 : Gestion Hôpital");
                    System.out.println("2 : Gestion Patient");
                    System.out.println("3 : Gestion Praticien");
                    System.out.println("4 : Gestion Médicament");
                    try {
                    input = scanner.nextInt();
                        switch (input) {
                            case 1:
                                System.out.println("Choisissez votre option : \n");
                                System.out.println("1 : Changer Hopital");
                                System.out.println("2 : Ajouter Hopital");
                                System.out.println("3 : Afficher places disponibles");
                                input = scanner.nextInt();
                                switch (input) {
                                    case 1:
                                        Hopital.changeHospital();
                                        break;
                                    case 2:
                                        Hopital.addHopital();
                                        break;
                                    case 3:
                                        Patient.setNombrePatients();
                                        int taille = Hopital.listeHopitaux.get(Hopital.actuelHopital).getTaille();
                                        taille = taille - Patient.nombrePatients;
                                        System.out.println("Places disponibles : " + taille);
                                        break;
                                }
                                menu();
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
                                        try {
                                            input = scanner.nextInt();
                                            switch (input) {
                                                case 1:
                                                    Hopital.createRendezVous();
                                                    break;
                                                case 2:
                                                    System.out.println(Semaine.Jours);
                                                    break;
                                            }
                                        } catch (Exception e) {
                                            e.printStackTrace();
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
                                System.out.println("4 : Rattacher un Praticien avec un patient");
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
                                    case 4:
                                        Praticien.linkPraticienPatient();
                                        break;
                                }
                                menu();
                                break;
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
                    } catch (Exception e) {
                        System.out.println("ERREUR");
                        menu();
                    }
                case 2:
                    System.out.println("\n1 : Laspitau Music");
                    System.out.println("2 : Mini-jeu");
                    input = scanner.nextInt();
                    switch (input) {
                        case 1:
                            System.out.println("\n -- Laspitau Music -- \n");
                            if (!Playlist.listePlaylists.isEmpty()) {
                                    System.out.println(" - Playlist " + Playlist.listePlaylists.get(Playlist.actualPlaylist).getNomPlaylist() + " -");
                            }
                            System.out.println("Choisissez votre option :");
                            if (Playlist.listePlaylists.isEmpty()) {
                                System.out.println("Voulez vous importer des playlists/musiques ? ");
                                System.out.println("1 : Oui");
                                System.out.println("2 : Non");
                                try{
                                    input = scanner.nextInt();
                                    switch (input) {
                                        case 1:
                                            Import imp = new Import();
                                            System.out.println("Playlist importée avec succès");
                                            menu();
                                            break;
                                        case 2:
                                            Playlist.addPlaylist();
                                            break;
                                    }
                                } catch (Exception e) {
                                    System.out.println("Erreur, retour au menu");
                                    menu();
                                }

                                menu();
                            }
                            System.out.println("1 : Gestion PLaylist");
                            System.out.println("2 : Gestion Musique");
                            input = scanner.nextInt();
                            switch (input) {
                                case 1:
                                    System.out.println("Choisissez votre option : \n");
                                    System.out.println("1 : Changer Playlist");
                                    System.out.println("2 : Ajouter Playlist");
                                    input = scanner.nextInt();
                                    switch (input) {
                                        case 1:
                                            Playlist.changePlaylist();
                                            break;
                                        case 2:
                                            Playlist.addPlaylist();
                                            break;
                                    }
                                    break;
                                case 2:
                                    System.out.println("Choisissez votre option : ");
                                    System.out.println("1 : Ajout d'une Musique");
                                    System.out.println("2 : Retirer une Musique");
                                    System.out.println("3 : Afficher les Musiques");
                                    System.out.println("4 : Lire une Musique");
                                    try{
                                        input = scanner.nextInt();
                                        switch (input) {
                                            case 1:
                                                Musique.addMusique();
                                                break;
                                            case 2:
                                                Musique.retirerMusique();
                                                break;
                                            case 3:
                                                Musique.showMusique();
                                                break;
                                            case 4:
                                                System.out.println("1 : Lire les Musiques de la Playlist en aléatoire");
                                                System.out.println("2 : Lire les Musiques de la Playlist dans l'ordre");
                                                try{
                                                    input = scanner.nextInt();
                                                    switch (input) {
                                                        case 1:
                                                            Collections.shuffle(Musique.listeMusique);
                                                            Musique.showActualMusique();
                                                            boolean ecoute = false;
                                                            while (ecoute == false) {
                                                                System.out.println("1 : changer de musique aléatoirement");
                                                                System.out.println("2 : arreter la musique");
                                                                input = scanner.nextInt();
                                                                if (input == 1) {
                                                                    Collections.shuffle(Musique.listeMusique);
                                                                    Musique.showActualMusique();
                                                                } else if (input == 2) {
                                                                    ecoute = true;
                                                                    menu();
                                                                }
                                                                else{
                                                                    System.out.println("ERREUR");
                                                                    menu();
                                                                }
                                                            }
                                                        case 2:
                                                            Musique.showActualMusique();
                                                            ecoute = false;
                                                            while (ecoute == false) {
                                                                System.out.println("1 : revenir au morceau précédent");
                                                                System.out.println("2 : passer au morceau suivant");
                                                                System.out.println("3 : arreter la musique");
                                                                input = scanner.nextInt();
                                                                if (input == 1) {
                                                                    Musique.changerMoinsMusique();
                                                                } else if (input == 2) {
                                                                    Musique.changerPlusMusique();
                                                                } else if (input == 3) {
                                                                    ecoute = true;
                                                                    menu();
                                                                }
                                                                else{
                                                                    System.out.println("ERREUR, retour au menu");
                                                                }
                                                            }
                                                    }
                                                } catch (Exception e) {
                                                    System.out.println("Erreur, retour au menu..");
                                                    menu();
                                                }
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Erreur, retour au menu..");
                                        menu();
                                    }
                            }

                            break;
                        case 2:
                            System.out.println("Le jeu va bientôt commencer, êtes-vous pret ? (Y/N)");
                            String reponse = scanner.next();
                            try {
                                if (reponse.equals("Y")) {
                                    MenuLieu.menuLieu();
                                    break;
                                } else if (reponse.equals("N")) {
                                    menu();
                                }
                                else {
                                    System.out.println("Erreur, veuillez indiquer un caractère valide\n");
                                    menu();
                                }
                            } catch (Exception e) {
                                System.out.println("Erreur, veuillez indiquer un caractère valide\n");
                            }
                            menu();
                    }
            }
        } catch (Exception e) {
            System.out.println("Erreur, veuillez indiquer une commande valide");
            menu();
        }
    }
}
