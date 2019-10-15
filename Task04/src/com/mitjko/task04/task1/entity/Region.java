package com.mitjko.task04.task1.entity;

import java.util.ArrayList;
import java.util.Objects;

public class Region {
    private ArrayList<Area> areas;
    private City regionalCentre;
    private String name;


    public Region(String name){
        this.name = name;
        areas = new ArrayList<Area>();
        regionalCentre = new City();
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
        return areas.equals(region.areas) &&
                regionalCentre.equals(region.regionalCentre) &&
                name.equals(region.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(areas, regionalCentre, name);
    }

    @Override
    public String toString() {
        return "Region{" +
                "areas=" + areas +
                ", regionalCentre=" + regionalCentre +
                ", name='" + name + '\'' +
                '}';
    }

    public Area getArea(int i){
        return areas.get(i);
    }

    public void setArea(Area area){
        areas.add(area);
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
