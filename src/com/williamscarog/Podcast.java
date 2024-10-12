package com.williamscarog;

public class Podcast extends Audio{
    private int episode;
    private String series;

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
}
