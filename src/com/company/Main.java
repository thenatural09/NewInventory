package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        Item item = new Item("sword",20);
        item.getName();
        item.getQuantity();
        items.add(item);
        String selectedItemName = items.get(0).getName();
        int quantityOfItem = items.get(0).getQuantity();
        System.out.printf("1. [%s] %s\n", quantityOfItem, selectedItemName);
    }
}
