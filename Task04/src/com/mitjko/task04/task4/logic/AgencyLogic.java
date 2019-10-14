package com.mitjko.task04.task4.logic;

import com.mitjko.task04.task4.entity.Agency;
import com.mitjko.task04.task4.entity.Client;
import com.mitjko.task04.task4.entity.Tour;

import java.util.ArrayList;

public class AgencyLogic {
    public Tour chooseTour(Agency agency, Client client){
        int index = agency.getTours().indexOf(client.getTour());
        return agency.getTour(index);
    }

    public Tour chooseTourByType(Agency agency, Client client){
        int index = -1;
        for(int i = 0; i < agency.getTours().size(); i++){
            if(agency.getTour(i).getType().equals(client.getTour().getType())){
                index = i;
                break;
            }
        }
        return agency.getTour(index);
    }

    public Tour chooseTourByFood(Agency agency, Client client){
        int index = -1;
        for(int i = 0; i < agency.getTours().size(); i++){
            if(agency.getTour(i).getFood().equals(client.getTour().getFood())){
                index = i;
                break;
            }
        }
        return agency.getTour(index);
    }

    public Tour chooseTourByTransport(Agency agency, Client client){
        int index = -1;
        for(int i = 0; i < agency.getTours().size(); i++){
            if(agency.getTour(i).getTransport().equals(client.getTour().getTransport())){
                index = i;
                break;
            }
        }
        return agency.getTour(index);
    }

    public Tour chooseTourByDays(Agency agency, Client client){
        int index = -1;
        for(int i = 0; i < agency.getTours().size(); i++){
            if(agency.getTour(i).getDays() == client.getTour().getDays()){
                index = i;
                break;
            }
        }
        return agency.getTour(index);
    }

    public ArrayList<Tour> sortByDays(Agency agency){
        ArrayList<Tour> temp = agency.getTours();
        temp.sort(Tour::compareTo);
        return temp;
    }
}
