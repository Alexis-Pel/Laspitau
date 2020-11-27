package com.company;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Logger {
    PrintWriter writer = new PrintWriter("Sauvegarde.txt", "UTF-8");

    public Logger(String text) throws FileNotFoundException, UnsupportedEncodingException {
        writer.println(text);
        writer.close();
    }
}
