package music;

public class MusicPlayer {
    private boolean isPlaying;

    public MusicPlayer(){
        isPlaying = false;
    }

    public void startPlaying(String filename){
        System.out.println("File: " + filename + " is now playing.");
        isPlaying = true;
    }

    public void stopPlaying(){
        if(isPlaying){
            System.out.println("Track stopped.");
            isPlaying = false;
        }else{
            System.out.println("No track is currently playing.");
        }
    }
}
