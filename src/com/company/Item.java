package com.company;

/**
 * Created by Troy on 9/19/16.
 */
public class Item {
    String text;
    int quantity;

    public String getName() {
        return text;
    }

    public void setName(String name) {
        this.text = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Item(String text, int quantity) {
        this.text = text;
        this.quantity = quantity;


    }
}
