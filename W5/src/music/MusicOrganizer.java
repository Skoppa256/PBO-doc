package music;

import track.*;
import java.util.ArrayList;

public class MusicOrganizer {
    private ArrayList<Track> tracks;
    private MusicPlayer player;
    private TrackReader reader;

    public MusicOrganizer(){
        tracks = new ArrayList<Track>();
        player = new MusicPlayer();
        reader = new TrackReader();
        readLibrary("../music_files");
        System.out.println("Music library loaded. " + getNumberOfTracks() + " tracks.");
        System.out.println();
    }

    public void addTrack(Track track){
        tracks.add(track);
    }

    public int getNumberOfTracks(){
        return tracks.size();
    }

    public void searchTrack(int index){
        if(index >= 0 && index < tracks.size()){
            Track result = tracks.get(index);
            System.out.println(result.getDisplayString());
        }
    }

    public void listAllTracks(){

        if(tracks.size() > 0){
            System.out.println("Tracks List:");

            int index = 0;
            while(index < tracks.size()){
                Track track = tracks.get(index);
                index++;
                System.out.println(index + ". " + track.getDisplayString());
            }
        }else{
            System.out.println("Tracks List is empty.");
        }
        
        System.out.println("");
    }

    public void removeTrack(int index){
        if(index >= 0 && index < tracks.size()){
            tracks.remove(index);
        }
    }

    public void playTrack(int index){
        int real_index = index - 1;
        if(indexValid(real_index)){
            Track track = tracks.get(real_index);
            player.startPlaying(track.getFilename());
            System.out.println("Now playing: " + track.getDisplayString());
        }

        System.out.println("");
    }

    public void stopTrack(){
        player.stopPlaying();
        System.out.println("");
    }

    public void readLibrary(String folderName){
        tracks = reader.readTracks(folderName);
    }

    public boolean indexValid(int index){
        return index >= 0 && index < tracks.size();
    }
}
