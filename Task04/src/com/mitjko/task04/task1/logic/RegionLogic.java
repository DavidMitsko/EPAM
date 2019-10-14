package com.mitjko.task04.task1.logic;

import com.mitjko.task04.task1.entity.Region;

public class RegionLogic {
    public void calcSquare(Region region) {
        double square = 0;
        for (int i = 0; i < region.getAreas().size(); i++) {
            square += region.getArea(i).getSquareOfArea();
        }
        region.setSquare(square);
    }

    public void calcPopulation(Region region) {
        int population = 0;
        for (int i = 0; i < region.getAreas().size(); i++) {
            population += region.getArea(i).getPopulationOfArea();
        }
        region.setPopulation(population);
    }
}
