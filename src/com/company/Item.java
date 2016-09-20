package com.company;

/**
 * Created by Troy on 9/19/16.
 */
public class Item {
    String itemName;
    int quantity;

    public String getName() {
        return itemName;
    }

    public void setName(String name) {
        this.itemName = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Item(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;


    }
}
