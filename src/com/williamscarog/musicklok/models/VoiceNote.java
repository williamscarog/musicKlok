package com.williamscarog.musicklok.models;

import java.util.Date;

public class VoiceNote extends Audio{
    private Date recordingDate;
    private boolean visible;
    //GETTERS AND SETTERS

    public Date getRecordingDate() {
        return recordingDate;
    }

    public void setRecordingDate(Date recordingDate) {
        this.recordingDate = recordingDate;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
}
