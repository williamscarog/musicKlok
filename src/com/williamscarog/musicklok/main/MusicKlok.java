package com.williamscarog.musicklok.main;

import com.williamscarog.musicklok.models.Audio;
import com.williamscarog.musicklok.models.MyFavorite;
import com.williamscarog.musicklok.models.Song;
import com.williamscarog.musicklok.models.Sound;

public class MusicKlok {
    public static void main(String[] args) {
        Audio aleluya = new Song();
        aleluya.setTitle("Taejun Alejandro");
        aleluya.setAuthor("Williamscarog");
        aleluya.setDuration(03.00);
        aleluya.setTotalLikes(7);
        aleluya.setTotalPlays(251);

        System.out.println("The song title is: "+aleluya.getTitle());
        System.out.println("and the song author is: "+aleluya.getAuthor());

        Sound pirate = new Sound();
        pirate.setAuthor("Jack Sparow");
        pirate.setSoundType("Human");
        pirate.setTitle("Ärgs, Voice");

        System.out.println("The sound Author is: "+pirate.getAuthor());
        System.out.println("and the sound type is: "+pirate.getSoundType());

        for (int counterOfPlays = 0; counterOfPlays < 125; counterOfPlays++) {
            aleluya.play();
        }

        for (int counterOfLikes =0; counterOfLikes < 5000; counterOfLikes++) {
            aleluya.like();
        }

        for (int counterOfPlays = 0; counterOfPlays < 100; counterOfPlays++) {
            pirate.play();
        }

        for (int counterOfLikes =0; counterOfLikes < 20; counterOfLikes++) {
            pirate.like();
        }

        System.out.println("The total of likes of the song : "+ aleluya.getTitle()+ " is "+aleluya.getTotalLikes());
        System.out.println("The total of plays of the song: "+ aleluya.getTitle()+ " is "+aleluya.getTotalPlays());

        MyFavorite myLoved = new MyFavorite();
        myLoved.add(aleluya);
        myLoved.add(pirate);


    }
}
