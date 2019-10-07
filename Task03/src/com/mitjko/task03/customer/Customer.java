package com.mitjko.task03.customer;

public class Customer {
    private int id;
    private String name;
    private String forename;
    private String patronymic;
    private String address;
    private int creditCardNumber;
    private int bankAccountNumber;

    public Customer(int id, String name, String forename, String patronymic, String address,
                    int creditCardNumber, int bankAccountNumber) {
        this.id = id;
        this.name = name;
        this.forename = forename;
        this.patronymic = patronymic;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public String toString(){
        String resultString = id + " " + name + " " + forename + " " + patronymic + " "
                + creditCardNumber + " " + bankAccountNumber;
        return resultString;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }
}

