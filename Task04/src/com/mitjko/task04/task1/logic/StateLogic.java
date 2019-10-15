package com.mitjko.task04.task1.logic;

import com.mitjko.task04.task1.entity.State;

public class StateLogic {
    public double calcSquare(State state, RegionLogic regionLogic) {
        double square = 0;
        for (int i = 0; i < state.getRegions().size(); i++) {
            square += regionLogic.calcSquare(state.getRegion(i));//state.getRegion(i).getSquare();
        }
        //state.setSquare(square);
        return square;
    }

    public int calcPopulation(State state, RegionLogic regionLogic) {
        int population = 0;
        for (int i = 0; i < state.getRegions().size(); i++) {
            population += regionLogic.calcPopulation(state.getRegion(i));//state.getRegion(i).getPopulation();
        }
        //state.setPopulation(population);
        return population;
    }
}
