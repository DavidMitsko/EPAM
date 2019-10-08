package com.mitjko.task03.customer_entity;

public class Shop {
    Customer[] customers;
    private int size;

    public Shop(int size) {
        this.size = size;
        customers = new Customer[size];
    }

    public Shop(Customer[] customers) {
        this.customers = customers;
        this.size = customers.length;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public Customer getCustomer(int i){
        return customers[i];
    }

    public void setCustomer(int i, Customer customer){
        this.customers[i] = customer;
    }
}
