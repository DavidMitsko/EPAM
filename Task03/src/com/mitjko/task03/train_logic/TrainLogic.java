package com.mitjko.task03.train_logic;

import com.mitjko.task03.train.Train;

public class TrainLogic {
    public boolean retTrain(Train train, int number) {
        if (train.getNumber() == number)
            return true;
        return false;
    }

    public Train[] numberSort(Train[] trains){
        Train temp;
        for(int j = 0; j < 5; j++){
            for(int i = 0; i < 4; i++){
                if(trains[i].getNumber() > trains[i + 1].getNumber()){
                    temp = trains[i];
                    trains[i] = trains[i + 1];
                    trains[i + 1] = temp;
                }
            }
        }
        return trains;
    }

    public Train[] destinationSort(Train[] trains){
        Train temp;
        for(int j = 0; j < 5; j++){
            for(int i = 0; i < 4; i++){
                if(trains[i].getDestination().compareTo(trains[i+1].getDestination()) == 0){
                    if(trains[i].getDepartureTime() > trains[i + 1].getDepartureTime()){
                        temp = trains[i];
                        trains[i] = trains[i + 1];
                        trains[i + 1] = temp;
                    }
                }
                if(trains[i].getDestination().compareTo(trains[i+1].getDestination()) > 0){
                    temp = trains[i];
                    trains[i] = trains[i + 1];
                    trains[i + 1] = temp;
                }
            }
        }
        return trains;
    }
}
