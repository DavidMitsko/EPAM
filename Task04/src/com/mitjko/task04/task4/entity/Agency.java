package com.mitjko.task04.task4.entity;

import java.util.ArrayList;

public class Agency {
    private ArrayList<Tour> tours;

    public Agency() {
        tours = new ArrayList<Tour>();
    }

    public ArrayList<Tour> getTours() {
        return tours;
    }

    public void setTours(ArrayList<Tour> tours) {
        this.tours = tours;
    }

    public Tour getTour(int i){
        return tours.get(i);
    }

    public void setTour(Tour tour){
        tours.add(tour);
    }
}
