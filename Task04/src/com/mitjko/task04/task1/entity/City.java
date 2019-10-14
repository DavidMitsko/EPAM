package com.mitjko.task04.task1.entity;

import java.util.Objects;

public class City {
    private String name;
    private double square;
    private int population;

    public City(String name, double square, int population) {
        this.name = name;
        this.square = square;
        this.population = population;
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
        City city = (City) o;
        return Double.compare(city.square, square) == 0 &&
                population == city.population &&
                name.equals(city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, square, population);
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", square=" + square +
                ", population=" + population +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
