package com.williamscarog.musicklok.models;

public class Song extends Audio{

    private String musicGenre;
    private String album;

    //GETTERS AND SETTERS
    public String getMusicGenre() {
        return musicGenre;
    }

    public void setMusicGenre(String musicGenre) {
        this.musicGenre = musicGenre;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public int getRating(){
        if (getTotalLikes() > 5000){
            return 9;
        }else {
            return 4;
        }
    }
}
