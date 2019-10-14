package com.mitjko.task04.task3.entity;

import java.util.ArrayList;

public class Client {
    private ArrayList<Account> accounts;
    private int number;

    public Client(ArrayList<Account> accounts) {
        this.accounts = accounts;
        this.number = accounts.size();
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Account getAccount(int i){
        return accounts.get(i);
    }

    public void setAccount(Account account){
        accounts.add(account);
    }
}
