package com.mitjko.task03.train_logic;

import com.mitjko.task03.train_entity.Train;

import java.util.Scanner;

public class TrainMain {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        TrainLogic trainLogic = new TrainLogic();
        Train trains[] = new Train[5];
        for(int i = 0; i < 5; i++){
            trains[i] = new Train();
            System.out.println("Enter number of train");
            trains[i].setNumber(scan.nextInt());
            System.out.println("Enter destination");
            trains[i].setDestination(scan.next());
            System.out.println("Enter the time");
            trains[i].setDepartureTime(scan.nextDouble());
        }
        int number;
        number = scan.nextInt();
        for(int i = 0; i < 5; i++){
            if(trainLogic.retTrain(trains[i],number))
                System.out.println(trains[i].getNumber() + " " + trains[i].getDestination() +
                        " " + trains[i].getDepartureTime());
        }
        System.out.println();
        trains = trainLogic.numberSort(trains);
        for(int i = 0; i < 5; i++){
            System.out.println(trains[i].getNumber() + " " + trains[i].getDestination() +
                    " " + trains[i].getDepartureTime());
        }
        System.out.println();
        trains = trainLogic.destinationSort(trains);
        for(int i = 0; i < 5; i++){
            System.out.println(trains[i].getNumber() + " " + trains[i].getDestination() +
                    " " + trains[i].getDepartureTime());
        }
    }
}
