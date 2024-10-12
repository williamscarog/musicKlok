package com.williamscarog;

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
}
