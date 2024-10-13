package com.williamscarog.musicklok.models;

public class MyFavorite {
    public void add(Audio audio){
        if (audio.getRating() ==10 ){
            System.out.println("Want to hear the hottes now? Listen this now: ----> "+ audio.getTitle() );
        }else if (audio.getRating() > 6){
            System.out.println("Interested in something popular? listen this now: " +audio.getTitle());
        } else {
            System.out.println("This could be in your favorites: " + audio.getTitle());
        }

    }
}
