import music.MusicOrganizer;

public class Main {
    public static void main(String[] args) {
        MusicOrganizer org = new MusicOrganizer();

        org.listAllTracks();

        org.playTrack(1);
        org.playTrack(3);

        org.stopTrack();

        org.playTrack(2);

        org.stopTrack();
    }
}
