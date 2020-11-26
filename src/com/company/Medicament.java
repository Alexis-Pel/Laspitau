package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Medicament {
    private String ISNCode;
    private String nomenclature;
    private String description;
    private int quantityAvailable;
    private String dateOfPrescription;
    private String price;
    public static List<Medicament> listeMedicament = new ArrayList<>();

    public Medicament(String ISNCode, String nomenclature, String description, int quantityAvailable, String dateOfPrescription, String price) {
        this.ISNCode = ISNCode;
        this.nomenclature = nomenclature;
        this.description = description;
        this.quantityAvailable = quantityAvailable;
        this.dateOfPrescription = dateOfPrescription;
        this.price = price;
    }

    public static void addMedicament(){
        System.out.println("Ajouter combien de médicaments ?");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for(int i = 0; i<input ; i++){
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Code ISN du médicament");
            String ISNCode = scanner1.nextLine();
            System.out.println("Nomenclature du médicament");
            String nomenclature = scanner1.nextLine();
            System.out.println("Description du médicament (quelques mots)");
            String description = scanner1.nextLine();
            System.out.println("Quantité disponible");
            int quantityAvailable = scanner1.nextInt();
            System.out.println("Date de la prescription");
            String dateOfPrescrpition = scanner1.next();
            System.out.println("Prix du médicament");
            String price = scanner1.next();
            Medicament medicament = new Medicament(ISNCode,nomenclature,description,quantityAvailable,dateOfPrescrpition,price);
            listeMedicament.add(medicament);
        }
    }

    public static void showMedicament(){
        if(listeMedicament.isEmpty()){
            System.out.println("Veuillez ajouter des médicaments.\n");
            Menu.menu();
        }
        for (int i = 0; i < listeMedicament.size(); i++){
            System.out.println(listeMedicament.get(i).getISNCode() + " " + listeMedicament.get(i).getNomenclature() + " " + listeMedicament.get(i).getDateOfPrescription());

        }
    }

    public String getISNCode(){
        return ISNCode;
    }
    public String getNomenclature(){
        return nomenclature;
    }
    public String getDateOfPrescription(){
        return dateOfPrescription;
    }
}
