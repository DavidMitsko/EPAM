package com.mitjko.task03.customer_logic;

import com.mitjko.task03.customer_entity.Customer;
import com.mitjko.task03.customer_entity.Shop;

public class ShopLogic {
    private Shop shop;

    public ShopLogic(Shop shop) {
        this.shop = shop;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Shop sortAlphabet(){
        Customer temp;
        Shop sortShop = shop;
        for(int i = 0; i < shop.getCustomers().length; i++){
            int min = i;
            for(int j = i + 1; j < shop.getCustomers().length; j++){
                if(sortShop.getCustomer(i).getName().compareTo(sortShop.getCustomer(j).getName()) > 0) {
                    min = j;
                }
            }
            if(min != i){
                temp = sortShop.getCustomer(i);
                sortShop.setCustomer(i, sortShop.getCustomer(min));
                sortShop.setCustomer(min, temp);
            }
        }
        return  sortShop;
    }

    public boolean isInRange(int i, int lowerLimit, int upperLimit){
        if(shop.getCustomer(i).getCreditCardNumber() >= lowerLimit &&
                shop.getCustomer(i).getCreditCardNumber() <= upperLimit) {
            return true;
        }
        else {
            return false;
        }
    }
}
