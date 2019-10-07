package com.mitjko.task03.customer_logic;

import com.mitjko.task03.customer.Customer;

public class CustomerLogic {
    Customer[] customers;


    public CustomerLogic(Customer[] customers){
        this.customers = customers;
    }

    public void sortAlphabet(){
        Customer temp;
        for(int i = 0; i < customers.length; i++){
            int min = i;
            for(int j = i + 1; j < customers.length; j++){
                if(customers[i].getName().compareTo(customers[j].getName()) > 0)
                    min = j;
            }
            if(min != i){
                temp = customers[i];
                customers[i] = customers[min];
                customers[min] = temp;
            }
        }
    }

    public boolean isInRange(int i, int lowerLimit, int upperLimit){
        if(customers[i].getCreditCardNumber() >= lowerLimit && customers[i].getCreditCardNumber() <= upperLimit)
            return true;
        else
            return false;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }
}
