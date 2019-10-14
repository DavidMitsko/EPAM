package com.mitjko.task04.task1.logic;

import com.mitjko.task04.task1.entity.State;

public class StateLogic {
    public void calcSquare(State state) {
        double square = 0;
        for (int i = 0; i < state.getRegions().size(); i++) {
            square += state.getRegion(i).getSquare();
        }
        state.setSquare(square);
    }

    public void calcPopulation(State state) {
        int population = 0;
        for (int i = 0; i < state.getRegions().size(); i++) {
            population += state.getRegion(i).getPopulation();
        }
        state.setPopulation(population);
    }
}
