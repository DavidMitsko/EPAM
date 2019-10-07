package com.mitjko.task03.time;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(){
        hour = 0;
        minute = 0;
        second = 0;
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour < 0 || hour >= 24)
            this.hour = 0;
        else
            this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(minute < 0 || minute >= 60)
            this.minute = 0;
        else
            this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(second < 0 || second >= 60)
            this.second = 0;
        else
            this.second = second;
    }
}
