package com.mitjko.task03.customer_logic;

import com.mitjko.task03.customer.Customer;

import java.util.Arrays;
import java.util.Scanner;

public class CustomerMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Customer[] customers = new Customer[3];
        customers[0] = new Customer(1, "Pupkin", "Vasja", "Ivanovitsh",
                "Parkovaja", 123, 456);
        customers[1] = new Customer(2, "Ivanov", "Ivan", "Ivanivitsh",
                "Unter den Linden", 789, 147);
        customers[2] = new Customer(3, "Sidorov","Oleg", "Radionovitsh",
                "Ku`dann", 258, 369);
        CustomerLogic customerLogic = new CustomerLogic(customers);
        customerLogic.sortAlphabet();
        System.out.println(Arrays.toString(customerLogic.getCustomers()));
        int lowerLimit, upperLimit;
        lowerLimit = scan.nextInt();
        upperLimit = scan.nextInt();
        for(int i = 0; i < 3; i++){
            if(customerLogic.isInRange(i, lowerLimit, upperLimit)){
                System.out.println(customerLogic.getCustomers()[i]);
            }
        }
    }
}
