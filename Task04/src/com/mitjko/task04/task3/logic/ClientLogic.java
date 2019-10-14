package com.mitjko.task04.task3.logic;

import com.mitjko.task04.task3.entity.Account;
import com.mitjko.task04.task3.entity.Client;

import java.util.ArrayList;

public class ClientLogic {
    public ArrayList<Account> sort(Client client){
        ArrayList<Account> temp = client.getAccounts();
        temp.sort(Account::compareTo);
        return temp;
    }

    public Account find(Client client, int number){
        int index = 0;//client.getAccounts().indexOf(number);
        for(int i = 0; i < client.getAccounts().size(); i++){
            if(number == client.getAccount(i).getNumber()){
                index = i;
                break;
            }
        }
        return client.getAccount(index);
    }

    public int calculateSum(Client client){
        int sum = 0;
        for(int i = 0; i < client.getAccounts().size(); i++){
            if(client.getAccount(i).isBlocked() == false) {
                sum += client.getAccount(i).getBalance();
            }
        }
        return sum;
    }

    public int calculatePositiveBalance(Client client){
        int sum = 0, temp = 0;
        for(int i = 0; i < client.getAccounts().size(); i++){
            temp = client.getAccount(i).getBalance();
            if(client.getAccount(i).isBlocked() == false && temp > 0) {
                sum += temp;
            }
        }
        return sum;
    }

    public int calculateNegativeBalance(Client client){
        int sum = 0, temp = 0;
        for(int i = 0; i < client.getAccounts().size(); i++){
            temp = client.getAccount(i).getBalance();
            if(client.getAccount(i).isBlocked() == false && temp < 0) {
                sum += temp;
            }
        }
        return sum;
    }
}
