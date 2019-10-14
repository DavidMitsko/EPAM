package com.mitjko.task04.task4.entity;

import java.util.Objects;

public class Client {
    Tour tour;

    public Client(Tour tour) {
        this.tour = tour;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
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
        Client client = (Client) o;
        return tour.equals(client.tour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tour);
    }

    @Override
    public String toString() {
        return "Client{" +
                "tour=" + tour +
                '}';
    }
}
