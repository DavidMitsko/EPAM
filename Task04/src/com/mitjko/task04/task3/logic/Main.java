package com.mitjko.task04.task3.logic;

import com.mitjko.task04.task3.entity.Account;
import com.mitjko.task04.task3.entity.Client;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.setAccount(new Account(123, false, 2500));
        client.setAccount(new Account(145, true, 0));
        client.setAccount(new Account(456, false, -25));
        client.setAccount(new Account(128, false, 125));

        ClientLogic clientLogic = new ClientLogic();
        System.out.println(clientLogic.sort(client).toString());
        System.out.println(clientLogic.calculateSum(client));
        System.out.println(clientLogic.calculatePositiveBalance(client));
        System.out.println(clientLogic.calculateNegativeBalance(client));
        System.out.println(clientLogic.find(client, 123));
    }
}
