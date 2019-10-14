package com.mitjko.task04.task1.entity;

import java.util.ArrayList;
import java.util.Objects;

public class State {
    private String name;
    private ArrayList<Region> regions;
    private City capital;
    private double square;
    private int population;

    public State(String name, ArrayList<Region> regions, City capital, double square, int population) {
        this.name = name;
        this.regions = regions;
        this.capital = capital;
        this.square = square;
        this.population = population;
    }

    public State(String name, ArrayList<Region> regions, City capital) {
        this.name = name;
        this.regions = regions;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Region getRegion(int i){
        return regions.get(i);
    }

    public void setRegion(int i, Region region){
        regions.add(i, region);
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }

    public void setRegions(ArrayList<Region> regions) {
        this.regions = regions;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null){
            return false;
        }
        if(this.getClass() != o.getClass()){
            return false;
        }
        State state = (State) o;
        return Double.compare(state.square, square) == 0 &&
                population == state.population &&
                name.equals(state.name) &&
                regions.equals(state.regions) &&
                capital.equals(state.capital);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, regions, capital, square, population);
    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", regions=" + regions +
                ", capital=" + capital +
                ", square=" + square +
                ", population=" + population +
                '}';
    }
}
