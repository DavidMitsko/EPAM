package com.mitjko.task03.time_logic;

import com.mitjko.task03.time_entity.Time;

public class TimeMain {
    public static void main(String[] args){
        TimeLogic timeLogic = new TimeLogic();
        Time time = new Time();
        System.out.println(time.getHour() + " h " + time.getMinute() + " m " + time.getSecond() + " s");
        time.setHour(5);
        System.out.println(time.getHour() + " h " + time.getMinute() + " m " + time.getSecond() + " s");
        time.setMinute(58);
        System.out.println(time.getHour() + " h " + time.getMinute() + " m " + time.getSecond() + " s");
        time.setSecond(25);
        System.out.println(time.getHour() + " h " + time.getMinute() + " m " + time.getSecond() + " s");
        timeLogic.changeHour(time, 20);
        System.out.println(time.getHour() + " h " + time.getMinute() + " m " + time.getSecond() + " s");
        timeLogic.changeMinute(time, 12);
        System.out.println(time.getHour() + " h " + time.getMinute() + " m " + time.getSecond() + " s");
        timeLogic.changeSecond(time,2);
        System.out.println(time.getHour() + " h " + time.getMinute() + " m " + time.getSecond() + " s");
        time.setHour(25);
        System.out.println(time.getHour() + " h " + time.getMinute() + " m " + time.getSecond() + " s");
    }
}
