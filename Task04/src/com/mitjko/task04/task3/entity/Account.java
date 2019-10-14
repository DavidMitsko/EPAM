package com.mitjko.task04.task3.entity;

import java.util.Objects;

public class Account implements Comparable<Account>{
    private int number;
    private boolean isBlocked;
    private int money;

    public Account(int number, boolean isBlocked, int money) {
        this.number = number;
        this.isBlocked = isBlocked;
        this.money = money;
    }

    public int compareTo(Account account){
        if(this.isBlocked == false && account.isBlocked == true){
            return 1;
        }
        if(this.money > account.money){
            return 1;
        }else if(this.money < account.money){
            return -1;
        }else{
            return 0;
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
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
        Account account = (Account) o;
        return number == account.number &&
                isBlocked == account.isBlocked &&
                money == account.money;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, isBlocked, money);
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", isBlocked=" + isBlocked +
                ", money=" + money +
                '}';
    }
}
