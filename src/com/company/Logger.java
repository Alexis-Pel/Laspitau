package com.company;
import java.io.*;

public class Logger {
    PrintWriter writer = new PrintWriter("Sauvegarde.txt", "UTF-8");

    public Logger(String text) throws FileNotFoundException, UnsupportedEncodingException {
        writer.println(text);
        writer.close();
    }
}
