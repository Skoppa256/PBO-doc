package track;

import java.util.ArrayList;
import java.io.File;

public class TrackReader {
    
    public ArrayList<Track> readTracks(String folderName){
        ArrayList<Track> tracks = new ArrayList<>();

        File folder = new File(folderName);
        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Invalid folder path!");
            return tracks;
        }

        File[] files = folder.listFiles((dir, name) -> name.endsWith(".mp3"));
        if (files == null || files.length == 0) {
            System.out.println("No mp3 files found in the folder.");
            return tracks;
        }

        for(File file : files){
            String fileNameFull = file.getName();
            String fileName = fileNameFull.substring(0, fileNameFull.lastIndexOf(".mp3"));

            String[] parts = fileName.split("-");
            if (parts.length == 2) {
                String title = parts[0].trim();
                String artist = parts[1].trim();

                tracks.add(new Track(fileName, artist, title));
            } else {
                System.out.println("File name format incorrect for: " + fileName);
            }
        }

        return tracks;
    }

}
