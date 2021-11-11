package problemsolvingweek6;

import javax.swing.*;
import java.awt.*;

public class TestAlbum {

    public static void main(String[] args) {

        Song s1 = new Song("Sugar Baby Love", "Rubettes", "Pop", 136, 1977);
        Song s2 = new Song("Living on a Prayer", "Bon Jovi", "Rock", 184, 1985);
        Song s3 = new Song("Blue Suede Shoes", "Elvis Presley", "Pop", 157, 1963);
        Song s4 = new Song("Someone Like You", "Adele", "Pop", 223, 2013);
        Song s5 = new Song("House of Fun", "Madness", "Pop", 178, 1984);

        Song allSongs[] = {s1,s2,s3,s4,s5};

        Album album = new Album("Now that’s what I call music 98", allSongs, "Universal Music", 2016);

        JTextArea textArea = new JTextArea();
        Font font = new Font("monospaced",Font.PLAIN,12);
        textArea.setFont(font);

        String output = "";

        output += "Name: " + album.getName() + "\n\nProducer: " + album.getProducer() +
                "\n\nRelease Year: " + album.getReleaseYear() + "\n\nNumber of Tracks:" + album.getNumberOfTracks() +
                "\n\nTotal Playing Time: " + album.getPlayingTime() + " seconds" + String.format("\n\n%30s\n\n","Album Tracks");

        output += String.format("%-15s%-30s%s\n\n","Track Number","Title","Artist");

        for(int i=0; i< album.getNumberOfTracks(); i++)
               output += String.format("%-15d%-30s%s\n\n",album.getTracks()[i].getTrackNumber(),album.getTracks()[i].getTitle(),album.getTracks()[i].getArtist());

        textArea.append(output);

        JOptionPane.showMessageDialog(null,textArea,"Album Information",JOptionPane.INFORMATION_MESSAGE);

        int trackRequested = Integer.parseInt(JOptionPane.showInputDialog("Which track number would you like to play?"));

        album.playTrack(trackRequested);

        int choice = JOptionPane.showConfirmDialog(null,"Do you wish to shuffle the playlist?");

        if(choice==JOptionPane.YES_OPTION)
            album.shuffle();

        System.exit(0);
    }
}
