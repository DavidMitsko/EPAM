package com.mitjko.task03.customer_logic;

import com.mitjko.task03.customer_entity.Customer;
import com.mitjko.task03.customer_entity.Shop;

import java.util.Arrays;
import java.util.Scanner;

public class CustomerMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Customer[] customers = new Customer[3];
        customers[0] = new Customer(1, "Pupkin", "Vasilij", "Ivanovitsh",
                "Alexanderplatz", 123, 456);
        customers[1] = new Customer(2, "Ivanov", "Ivan", "Ivanovitsh",
                "Unter den Linden", 789, 147);
        customers[2] = new Customer(3, "Sidorov","Oleg", "Radionovitsh",
                "Kurfürstendamm", 258, 369);
        Shop shop = new Shop(customers);
        ShopLogic shopLogic = new ShopLogic(shop);
        Shop temp;
        temp = shopLogic.sortAlphabet();
        for(int i = 0; i < 3; i++){
            System.out.println(temp.getCustomer(i).toString());
        }
        int lowerLimit, upperLimit;
        lowerLimit = scan.nextInt();
        upperLimit = scan.nextInt();
        for(int i = 0; i < 3; i++){
            if(shopLogic.isInRange(i, lowerLimit, upperLimit)){
                System.out.println(shop.getCustomer(i).toString());
            }
        }
    }
}
