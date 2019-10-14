package com.mitjko.task04.task4.logic;

import com.mitjko.task04.task4.entity.Agency;
import com.mitjko.task04.task4.entity.Client;
import com.mitjko.task04.task4.entity.Tour;

public class Main {
    public static void main(String[] args) {
        Agency agency = new Agency();
        agency.setTour(new Tour("Cruise", 7, "all inclusive", "ship"));
        agency.setTour(new Tour("Excursion", 5, "breakfast", "bus"));
        agency.setTour(new Tour("Shopping", 3, "all inclusive", "bus"));
        agency.setTour(new Tour("Recreation", 10, "all inclusive", "plane"));


        Tour temp = new Tour();//("Shopping", 3, "all inclusive", "bus");
        temp.setType("Cruise");
        Client client = new Client(temp);

        AgencyLogic agencyLogic = new AgencyLogic();
        System.out.println(agencyLogic.chooseTourByType(agency, client).toString());

        System.out.println(agencyLogic.sortByDays(agency).toString());
    }
}
