package com.mitjko.task04.task1.entity;

import java.util.ArrayList;
import java.util.Objects;

public class Area {
    private ArrayList<City> cities;
    private String name;
    private int numberOfSettlements;
    private double squareOfArea;
    private int populationOfArea;

    public Area(ArrayList<City> cities, int numberOfSettlements, double squareOfArea, int populationOfArea) {
        this.cities = cities;
        this.numberOfSettlements = numberOfSettlements;
        this.squareOfArea = squareOfArea;
        this.populationOfArea = populationOfArea;
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
        Area area = (Area) o;
        return numberOfSettlements == area.numberOfSettlements &&
                Double.compare(area.squareOfArea, squareOfArea) == 0 &&
                populationOfArea == area.populationOfArea &&
                cities.equals(area.cities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cities, numberOfSettlements, squareOfArea, populationOfArea);
    }

    @Override
    public String toString() {
        return "Area{" +
                "cities=" + cities +
                ", numberOfSettlements=" + numberOfSettlements +
                ", squareOfArea=" + squareOfArea +
                ", populationOfArea=" + populationOfArea +
                '}';
    }

    public City getCity(int i){
        return cities.get(i);
    }

    public void setCity(int i, City city){
        this.cities.add(i, city);
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }

    public int getNumberOfSettlements() {
        return numberOfSettlements;
    }

    public void setNumberOfSettlements(int numberOfSettlements) {
        this.numberOfSettlements = numberOfSettlements;
    }

    public double getSquareOfArea() {
        return squareOfArea;
    }

    public void setSquareOfArea(double squareOfArea) {
        this.squareOfArea = squareOfArea;
    }

    public int getPopulationOfArea() {
        return populationOfArea;
    }

    public void setPopulationOfArea(int populationOfArea) {
        this.populationOfArea = populationOfArea;
    }
}
