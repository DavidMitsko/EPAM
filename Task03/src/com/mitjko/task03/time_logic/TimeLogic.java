package com.mitjko.task03.time_logic;

import com.mitjko.task03.time.Time;

public class TimeLogic {
    public void changeHour(Time time, int hour){
        if((hour + time.getHour()) <= 24)
            time.setHour(hour + time.getHour());
        else
            time.setHour(hour + time.getHour() - 24);
    }

    public void changeMinute(Time time, int minute){
        if((minute + time.getMinute()) <= 60)
            time.setMinute(minute + time.getMinute());
        else {
            time.setMinute(minute + time.getMinute() - 60);
            time.setHour(time.getHour() + 1);
        }
    }

    public void changeSecond(Time time, int second){
        if((second + time.getSecond()) <= 60)
            time.setSecond(second + time.getSecond());
        else {
            time.setSecond(second + time.getSecond() - 60);
            time.setMinute(time.getMinute() + 1);
        }
    }
}
