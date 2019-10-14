package com.mitjko.task04.task3.entity;

import java.util.ArrayList;
import java.util.Objects;

public class Client {
    private ArrayList<Account> accounts;

    public Client() {
        accounts = new ArrayList<Account>();
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public Account getAccount(int i){
        return accounts.get(i);
    }

    public void setAccount(Account account){
        accounts.add(account);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null){
            return false;
        }
        if(this.getClass() != o.getClass()){
            return false;
        }
        Client client = (Client) o;
        return accounts.equals(client.accounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accounts);
    }

    @Override
    public String toString() {
        return "Client " + accounts.toString();
    }
}
