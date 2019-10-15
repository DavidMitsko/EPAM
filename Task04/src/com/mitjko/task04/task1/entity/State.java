package com.mitjko.task04.task1.entity;

import java.util.ArrayList;
import java.util.Objects;

public class State {
    private String name;
    private ArrayList<Region> regions;
    private City capital;
    //private double square;
    //private int population;

    public State(String name) {
        this.name = name;
        this.regions = new ArrayList<Region>();
        this.capital = new City();
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

    public void setRegion(Region region){
        regions.add(region);
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
        return name.equals(state.name) &&
                regions.equals(state.regions) &&
                capital.equals(state.capital);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, regions, capital);
    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", regions=" + regions +
                ", capital=" + capital +
                '}';
    }
}
