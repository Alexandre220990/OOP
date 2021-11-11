package problemsolvingweek6;

import javax.swing.*;

public class Album {
    private String name;
    private Song[] tracks;
    private String producer;
    private int releaseYear;

    public Album(String name, Song[] tracks, String producer, int releaseYear) {
        setName(name);
        setTracks(tracks);
        setProducer(producer);
        setReleaseYear(releaseYear);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null || name.equals(""))
            this.name = "No name specified";
        else
            this.name = name;
    }

    public Song[] getTracks() {
        return tracks;
    }

    public void setTracks(Song[] tracks) {
        this.tracks = tracks;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String toString() {
        String allTracks="";

        for(int i=0; i< tracks.length; i++)
            allTracks += tracks[i] + "\n";

        return "Name: " + getName() + "  Tracks: \n\n"  + allTracks + "  "
                + "Producer: " + getProducer() +
                "   Release year: " + getReleaseYear();
    }

    public int getNumberOfTracks() {
        return tracks.length;
    }

    public int getPlayingTime() {
        int playingTime = 0;

        for(int i=0; i< tracks.length; i++)
            playingTime += tracks[i].getDuration();

        return playingTime;
    }

    public void playTrack(int trackNumber) {
        if(trackNumber<1 || trackNumber>tracks.length)
            JOptionPane.showMessageDialog(null,"An invalid track number was supplied!",
                    "Bad Track Number",JOptionPane.ERROR_MESSAGE);
        else
            JOptionPane.showMessageDialog(null,"Now playing track - details are as follows:\n\n" +
                    tracks[trackNumber-1],
                    "Playing Track",JOptionPane.INFORMATION_MESSAGE);
    }

    public void shuffle() {
        Song shuffledSongs[] = new Song[tracks.length];
        boolean alreadyPicked[] = new boolean[tracks.length];
        int randomNum;
        String output = "";

        for(int i=0; i< tracks.length; i++) {

            randomNum = (int) (Math.random()*tracks.length);

            while(alreadyPicked[randomNum])
                randomNum = (int) (Math.random()*tracks.length);

            alreadyPicked[randomNum] = true;

            shuffledSongs[i] = tracks[randomNum];
            output += shuffledSongs[i] + "\n";
        }

        JOptionPane.showMessageDialog(null,"Shuffled playlist is as follows:\n\n" +
                        output,
                "Shuffled Playlist",JOptionPane.INFORMATION_MESSAGE);

    }
}
