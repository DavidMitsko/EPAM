package com.mitjko.task04.task4.entity;

import java.util.Objects;

public class Tour implements Comparable<Tour>{
    private String type;
    private int days;
    private String food;
    private String transport;

    public Tour(String type, int days, String food, String transport) {
        this.type = type;
        this.days = days;
        this.food = food;
        this.transport = transport;
    }

    public Tour(String type) {
        this.type = type;
    }

    public Tour(int days) {
        this.days = days;
    }

    public Tour() {

    }

    public int compareTo(Tour tour){
        if(this.days > tour.days){
            return 1;
        }
        else if(this.days < tour.days){
            return -1;
        }
        return 0;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null){
            return false;
        }
        if(this.getClass() != o.getClass()){
            return false;
        }
        Tour tour = (Tour) o;
        return days == tour.days &&
                food.equals(tour.food) &&
                type.equals(tour.type) &&
                transport.equals(tour.transport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, days, food, transport);
    }

    @Override
    public String toString() {
        return "Tour{" +
                "type='" + type + '\'' +
                ", days=" + days +
                ", food='" + food + '\'' +
                ", transport='" + transport + '\'' +
                '}';
    }
}
