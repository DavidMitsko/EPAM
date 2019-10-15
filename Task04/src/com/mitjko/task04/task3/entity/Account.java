package com.mitjko.task04.task3.entity;

import java.util.Objects;

public class Account implements Comparable<Account>{
    private int number;
    private boolean block;
    private int balance;

    public Account(int number, boolean block, int balance) {
        this.number = number;
        this.block = block;
        this.balance = balance;
    }

    public int compareTo(Account account){
        if(this.balance > account.balance){
            return 1;
        }else if(this.balance < account.balance){
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
        return block;
    }

    public void setBlock(boolean block) {
        block = block;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
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
                block == account.block &&
                balance == account.balance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, block, balance);
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", isBlocked=" + block +
                ", balance=" + balance +
                '}';
    }
}
