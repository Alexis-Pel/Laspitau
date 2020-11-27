package com.company;
import java.io.*;

public class Import {
    public Import() throws IOException {
        File f = new File("Import.txt");
        BufferedReader reader = new BufferedReader(new FileReader(f));
        String line = null;
        while ((line = reader.readLine()) != null) {
            if (line.startsWith("Musique")) {
                String[] split = line.split("Musique:");
                String test = line.replace("Musique:", "#");
                split = test.split("#" );
                for (int i = 1; i < split.length-1; i++) {
                    if (i == 1){
                        Playlist playlist = new Playlist(split[1]);
                        Playlist.listePlaylists.add(playlist);
                    }
                    else{
                        int name = i;
                        i++;
                        Musique music = new Musique(split[name],split[i]);
                        Musique.listeMusique.add(music);
                    }
                }
            }
            else{
                break;
            }
        }
    }
}
