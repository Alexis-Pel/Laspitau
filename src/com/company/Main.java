package com.company;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Logger log = new Logger("je marche ");
        //Semaine.createDays();
        Semaine.createDays();
	    Menu.menu();
    }
}
