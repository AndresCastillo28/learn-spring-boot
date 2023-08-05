package com.andrescode.demo.rest;

public class StudentErrorResponse {

    private int status;
    private String messasge;
    private long timeStamp;

    public StudentErrorResponse() {

    }

    public StudentErrorResponse(int status, String messasge, long timeStamp) {
        this.status = status;
        this.messasge = messasge;
        this.timeStamp = timeStamp;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessasge() {
        return messasge;
    }

    public void setMessasge(String messasge) {
        this.messasge = messasge;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
