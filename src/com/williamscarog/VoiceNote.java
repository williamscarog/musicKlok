package com.williamscarog;

import java.util.Date;

public class VoiceNote extends Audio{
    private Date recordingDate;
    //GETTERS AND SETTERS

    public Date getRecordingDate() {
        return recordingDate;
    }

    public void setRecordingDate(Date recordingDate) {
        this.recordingDate = recordingDate;
    }
}
