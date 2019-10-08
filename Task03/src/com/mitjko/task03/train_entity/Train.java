package com.mitjko.task03.train_entity;

import java.util.Objects;

public class Train {
    private String destination;
    private int number;
    private double departureTime;

    public Train(){
        destination = new String();
    }

    public Train(String destination, int number, double departureTime) {
        this.destination = destination;
        this.number = number;
        this.departureTime = departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(double departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if(o == null){
            return false;
        }
        if(this.getClass() != o.getClass()){
            return false;
        }
        Train train = (Train) o;
        return number == train.number &&
                Double.compare(train.departureTime, departureTime) == 0 &&
                destination.equals(train.destination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, number, departureTime);
    }
}
