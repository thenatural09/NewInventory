package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        Item item = new Item("bow", 1);
        Item item2 = new Item("arrows", 15);
        Item item3 = new Item("people", 10);
        item.getName();
        item.getQuantity();
        items.add(item);
        item2.getName();
        item2.getQuantity();
        items.add(item2);
        item3.getName();
        item3.getQuantity();
        items.add(item3);
        String selectedItemName = items.get(0).getName();
        int quantityOfItem = items.get(0).getQuantity();
        String selectedItemName2 = items.get(1).getName();
        int quantityOfItem2 = items.get(1).getQuantity();
        String selectedItemName3 = items.get(2).getName();
        int quantityOfItem3 = items.get(2).getQuantity();
        System.out.printf("1. [%s] %s\n", quantityOfItem, selectedItemName);
        System.out.printf("2. [%s] %s\n", quantityOfItem2, selectedItemName2);
        System.out.printf("3. [%s] %s\n", quantityOfItem3, selectedItemName3);

        System.out.println("[1] Create new item");
        System.out.println("[2] Remove an item");
        System.out.println("[3] Update an item's quantity");

        String option = new String();
        while (true) {
            switch (option) {
                case "1":
                    System.out.println("Enter new item");
                    String itemName = scanner.nextLine();

            }
        }
    }
}