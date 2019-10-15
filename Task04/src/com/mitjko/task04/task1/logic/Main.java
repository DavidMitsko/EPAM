package com.mitjko.task04.task1.logic;

import com.mitjko.task04.task1.entity.Area;
import com.mitjko.task04.task1.entity.City;
import com.mitjko.task04.task1.entity.Region;
import com.mitjko.task04.task1.entity.State;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        State state = new State("Belarus");

        state.setRegion(new Region("Minsk region"));
        state.getRegion(0).setRegionalCentre(new City("Minsk", 5000, 2500000));

        state.setRegion(new Region("Brest region"));
        state.getRegion(1).setRegionalCentre(new City("Brest", 5000, 1000000));

        state.setCapital(new City("Minsk", 5000, 2500000));

        state.getRegion(0).setArea(new Area("Molo area", 2250, 120000));
        state.getRegion(0).setArea(new Area("Valozhin area", 1000, 25000));

        state.getRegion(1).setArea(new Area("Brest area", 5000, 1200000));
        state.getRegion(1).setArea(new Area("Bugaga area", 2250, 10000));

        state.getRegion(0).getArea(0).setCity(new City("Molo", 2000, 100000));
        state.getRegion(0).getArea(1).setCity(new City("Valozhin", 1000, 25000));

        state.getRegion(1).getArea(0).setCity(new City("Brest", 5000, 1000000));
        state.getRegion(1).getArea(1).setCity(new City("Bugaga", 2000, 9000));

        RegionLogic regionLogic = new RegionLogic();
        for (int i = 0; i < state.getRegions().size(); i++) {
            regionLogic.calcPopulation(state.getRegions().get(i));
            regionLogic.calcSquare(state.getRegions().get(i));
        }

        StateLogic stateLogic = new StateLogic();

        System.out.println(state.getCapital().getName() + " " + stateLogic.calcPopulation(state, regionLogic) +
                " " + stateLogic.calcSquare(state, regionLogic));
        System.out.println(state.getRegions().size());
        for(int i = 0; i < state.getRegions().size(); i++){
            System.out.println(state.getRegion(i).getName() + " -- " + state.getRegion(i).getRegionalCentre().getName());
        }
    }
}
