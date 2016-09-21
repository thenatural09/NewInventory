package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        HashMap<String, ArrayList<Item>> users = new HashMap<>();

        while (true) {
            System.out.println("Enter new name");
            String userName = scanner.nextLine();
            ArrayList<Item> items = users.get(userName);
            if (items == null) {
                items = new ArrayList<>();
                users.put(userName,items);
            }

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
                        System.out.println("Enter new item quantity");
                        int newQuantity = Integer.valueOf(scanner.nextLine());
                        Item i1 = createItem(newItem,newQuantity);
                        items.add(i1);
                        break;
                    case "2":
                        System.out.println("Select an item to remove");
                        int itemNumber = Integer.valueOf(scanner.nextLine());
                        Item i2 = items.get(itemNumber - 1);
                        items.remove(i2);
                        break;
                    case "3":
                        System.out.println("Type item number to change quantity");
                        int quantityIndex = Integer.valueOf(scanner.nextLine());
                        System.out.println("What quantity does the item have?");
                        int itemQuantity = Integer.valueOf(scanner.nextLine());
                        items.get(quantityIndex - 1).quantity = itemQuantity;
                        break;
                    case "4":
                        for (int i = 0; i < items.size(); i++) {
                            Item i4 = items.get(i);
                            int numb = i + 1;
                            System.out.printf("%s. [%s] %s ... Category: %s\n", numb, i4.quantity, i4.itemName, i4.category);
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

    static Item createItem(String itemName,int itemQuantity) throws Exception {
        Item item;
        if(itemName.contains("bow")) {
            item = new Bow(itemName,itemQuantity);
        }
        else if(itemName.contains("sword")) {
            item = new Sword(itemName,itemQuantity);
        }
        else if(itemName.contains("armor")) {
            item = new Armor(itemName,itemQuantity);
        }
        else if(itemName.contains("helmet")) {
            item = new Helmet(itemName,itemQuantity);
        }
        else if(itemName.contains("arrow")) {
            item = new Arrow(itemName,itemQuantity);
        }
        else {
            throw new Exception("Invalid Item");
        }
        return item;
    }
}
