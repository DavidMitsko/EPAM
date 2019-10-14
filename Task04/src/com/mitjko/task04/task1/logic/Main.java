package com.mitjko.task04.task1.logic;

import com.mitjko.task04.task1.entity.Area;
import com.mitjko.task04.task1.entity.City;
import com.mitjko.task04.task1.entity.Region;
import com.mitjko.task04.task1.entity.State;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<City> cities = new ArrayList<City>();
        ArrayList<Area> areas = new ArrayList<Area>();
        ArrayList<Region> regions = new ArrayList<Region>();
        cities.add(new City("Valozhin", 1000, 25000));
        cities.add(new City("Molo", 2000, 100000));
        areas.add(new Area(cities, 5, 3550, 125000));
        regions.add(new Region(areas, new City("Minsk", 6000, 2500000), "Minsk region"));
        cities.clear();
        cities.add(new City("Brest", 5000, 1000000));
        cities.add(new City("", 4000, 100000));
        areas.add(new Area(cities, 3, 9000, 1100000));
        regions.add(new Region(areas, new City("Brest", 5000, 1000000), "Brest region"));

        RegionLogic regionLogic = new RegionLogic();
        for (int i = 0; i < regions.size(); i++) {
            regionLogic.calcPopulation(regions.get(i));
            regionLogic.calcSquare(regions.get(i));
        }

        State state = new State("Belarus", regions, new City("Minsk", 6000, 2500000));
        StateLogic stateLogic = new StateLogic();

        stateLogic.calcPopulation(state);
        stateLogic.calcSquare(state);

        System.out.println(state.getCapital().getName() + " " + state.getPopulation() + " " + state.getSquare());
        System.out.println(state.getRegions().size());
        for(int i = 0; i < state.getRegions().size(); i++){
            System.out.println(state.getRegion(i).getName() + " -- " + state.getRegion(i).getRegionalCentre().getName());
        }
    }
}
