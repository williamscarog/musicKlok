package com.williamscarog.musicklok.models;

public class Podcast extends Audio{
    private int episode;
    private String series;
    private String description;

    //GETTERS AND SETTERS

    public int getEpisode() {
        return episode;
    }

    public void setEpisode(int episode) {
        this.episode = episode;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int getRating() {
        if (getTotalPlays() >=200){
            return 10;
        }else {
            return 4;
        }
    }
}
