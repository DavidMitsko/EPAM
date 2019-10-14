package com.mitjko.task04.task1.entity;

import java.util.ArrayList;
import java.util.Objects;

public class Region {
    private ArrayList<Area> areas;
    private City regionalCentre;
    private double square;
    private int population;
    private String name;

    public Region(ArrayList<Area> areas, City regionalCentre, double square, int population, String name) {
        this.areas = areas;
        this.regionalCentre = regionalCentre;
        this.square = square;
        this.population = population;
        this.name = name;
    }

    public Region(ArrayList<Area> areas, City regionalCentre, String name) {
        this.areas = areas;
        this.regionalCentre = regionalCentre;
        this.name = name;
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
        Region region = (Region) o;
        return Double.compare(region.square, square) == 0 &&
                population == region.population &&
                areas.equals(region.areas) &&
                regionalCentre.equals(region.regionalCentre) &&
                name.equals(region.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(areas, regionalCentre, square, population, name);
    }

    @Override
    public String toString() {
        return "Region{" +
                "areas=" + areas +
                ", regionalCentre=" + regionalCentre +
                ", square=" + square +
                ", population=" + population +
                ", name='" + name + '\'' +
                '}';
    }

    public Area getArea(int i){
        return areas.get(i);
    }

    public void setArea(int i, Area area){
        areas.add(i, area);
    }

    public ArrayList<Area> getAreas() {
        return areas;
    }

    public void setAreas(ArrayList<Area> areas) {
        this.areas = areas;
    }

    public City getRegionalCentre() {
        return regionalCentre;
    }

    public void setRegionalCentre(City regionalCentre) {
        this.regionalCentre = regionalCentre;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
