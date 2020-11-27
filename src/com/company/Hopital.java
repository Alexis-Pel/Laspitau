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
    public static int actuelHopital = 0;

    /***
     * Constructeur d'un Hopital
     * @param name Le nom de l'hopital
     * @param adress L'adresse de l'hopital
     * @param special La spécialité de l'Hopital
     * @param taille la contenance de l'Hopital
     */
    public Hopital(String name, String adress, String special, int taille) {
        this.name = name;
        this.adress = adress;
        this.special = special;
        this.taille = taille;
    }

    /***
     * Permet d'ajouter un Hopital
     */
    public static void addHopital(){
        System.out.println("Ajouter combien d'hôpitaux ?");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for (int i = 0; i < input; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Nom de l'hôpital :");
            String name = scanner1.nextLine();
            System.out.println("Adresse de l'hôpital : ");
            String adress = scanner1.nextLine();
            System.out.println("Specialité de l'hôpital ( '' )( '' )( '' ) : ");
            String spec = scanner1.nextLine();
            System.out.println("Taille de l'hôpital : ");
            int taille = scanner1.nextInt();
            Hopital hopital = new Hopital(name, adress, spec, taille);
            listeHopitaux.add(hopital);
        }
    }

    /***
     * Permet de changer l'hôpital séléctionné
     */
    public static void changeHospital(){
        int nombreHopitaux = listeHopitaux.size();
        System.out.println("Il y a " + nombreHopitaux + " Hopital(aux) disponible(s) :");
        int a = 1;
        for (int i = 0; i < nombreHopitaux; i++) {
            System.out.println(a + " : " + listeHopitaux.get(i).getName());
            a++;
        }
        System.out.println("Choisissez l'hôpital :");
        try{
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            System.out.println("Vous avez choisi " + listeHopitaux.get(input-1).getName());
            actuelHopital = input-1;
        } catch (Exception e) {
            System.out.println("Erreur, veuillez indiquer un chiffre valide");
            changeHospital();
        }
    }

    /***
     * Permet de créer un rendez-vous
     */
    public static void createRendezVous(){
        System.out.println("Liste des praticiens disponibles\n");
        for (int i = 0; i < Praticien.listePraticien.size(); i++) {
            int hospital = Praticien.listePraticien.get(i).getWhichHospital();
            if (hospital == actuelHopital){
                System.out.println(Praticien.listePraticien.get(i).getName() + Praticien.listePraticien.get(i).getLastName() + " --> " + Praticien.listePraticien.get(i).getMatriculNumber());
            }
        }
        System.out.println("Liste des Patients disponibles\n");
        for (int i = 0; i < Patient.listePatients.size(); i++) {
            int hospital = Patient.listePatients.get(i).getWhichHospital();
            if (hospital == actuelHopital){
                System.out.println(Patient.listePatients.get(i).getName() + Patient.listePatients.get(i).getLastName() + " --> " + Patient.listePatients.get(i).getNumSecu());
            }
        }
        System.out.println("\nChoisissez le jour du rendez vous :");
        int nombreJours = Semaine.Jours.size();
        for (int i = 0; i < nombreJours; i++) {
            i++;
            System.out.println( i + " : " + " Jour " + i);
            i--;
        }
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt()-1;
        List Jour = (List) Semaine.Jours.get(input);
        System.out.println("Jour " + (input + 1));
        for (int i = 0; i < Jour.size(); i++) {
            System.out.println( (i + 1) + " : " + Jour.get(i));
        }
        input = scanner.nextInt();
        int indexHour = input - 1;
        Scanner demande = new Scanner(System.in);
        System.out.println("Veuillez entrer le Matricule du Praticien");
        String matricule = demande.nextLine();
        try{
            for (int i = 0; i < Praticien.listePraticien.size(); i++) {
                if (Praticien.listePraticien.get(i).getMatriculNumber().equals(matricule)){
                    break;
                }
                else{
                    System.out.println("Veuillez indiquer un Matricule correct");
                    createRendezVous();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Veuillez entrer le numéro de Sécu du Patient");
        String secu = demande.nextLine();
        try{
            for (int i = 0; i < Patient.listePatients.size(); i++) {
                if (Patient.listePatients.get(i).getNumSecu().equals(secu)){
                    break;
                }
                else{
                    System.out.println("Veuillez indiquer un numéro de Sécurité Sociale correct");
                    createRendezVous();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String Heure = (String) Jour.get(indexHour);
        Jour.remove(indexHour);
        Jour.add(indexHour,Heure + "_" + " RDV : " + matricule + "-" + secu);
        System.out.println(Jour);

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
