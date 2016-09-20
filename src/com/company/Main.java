package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<String, ArrayList<Item>> users = new HashMap<>();
//        ArrayList<Item> items = new ArrayList<>();\
        boolean mainMenu = true;

        while (mainMenu) {
            System.out.println("Enter new name");
            String name = scanner.nextLine();
            ArrayList<Item> items = new ArrayList<>();
            items = new ArrayList<>();
            users.put(name, items);

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

            boolean keepRunning = true;
            while (keepRunning) {
                System.out.println("[1] Create new item");
                System.out.println("[2] Remove an item");
                System.out.println("[3] Update an item's quantity");
                System.out.println("[4] List of items");
                System.out.println("[5] Logout");
                String option = scanner.nextLine();
                switch (option) {
                    case "1":
                        System.out.println("Enter new item");
                        String newItem = scanner.nextLine();
                        Item item4 = new Item(newItem, 0);
                        items.add(item4);
                        break;
                    case "2":
                        System.out.println("Select an item to remove");
                        int itemNumber = Integer.valueOf(scanner.nextLine());
                        Item item5 = items.get(itemNumber - 1);
                        items.remove(item5);
                        break;
                    case "3":
                        System.out.println("Select an item to change quantity");
                        itemNumber = Integer.valueOf(scanner.nextLine());
                        System.out.println("Enter new quantity");
                        int newQuantity = Integer.valueOf(scanner.nextLine());
                        Item item6 = new Item("help", newQuantity);
                        break;
                    case "4":
                        for (int i = 0; i < items.size(); i++) {
                            Item item7 = items.get(i);
                            int numb = i + 1;
                            System.out.printf("%s. [%s] %s\n", numb, item7.quantity, item7.name);
                        }
                        break;
                    case "5":
                        keepRunning = false;
                        break;
                    default:
                        System.out.println("Invalid response");
                }
            }
        }

    }
}
