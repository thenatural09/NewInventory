package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<String, ArrayList<Item>> users = new HashMap<>();
//        ArrayList<Item> items = new ArrayList<>();\


        while (true) {
            System.out.println("Enter new name");
            String userName = scanner.nextLine();
            ArrayList<Item> items = users.get(userName);
            if (items == null) {
                items = new ArrayList<>();
                users.put(userName,items);
            }


//            Item item = new Item("bow", 1);
//            Item item2 = new Item("arrows", 15);
//            Item item3 = new Item("people", 10);
//            items.add(item);
//            items.add(item2);
//            items.add(item3);
//            for(int j = 0; j > items.size(); j++) {
//                Item item0 = items.get(j);
//                int numb = j + 1;
//                System.out.printf("%s. [%s] %s\n", numb, item0.quantity, item0.itemName);
//
//            }

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
                        System.out.println("Type item number to change quantity");
                        int quantityIndex = Integer.valueOf(scanner.nextLine());
                        System.out.println("What quantity does the item have?");
                        int itemQuantity = Integer.valueOf(scanner.nextLine());
                        items.get(quantityIndex - 1).quantity = itemQuantity;
//                        newItem = scanner.nextLine();
//
////                        System.out.println("Enter new quantity");
////                        int newQuantity = Integer.valueOf(scanner.nextLine());
////                        Item item6 = new Item(itemName, newQuantity);
////                        items.add(item6);
//                        System.out.println("Enter new quantity");
//                        String enteredNewQuantity = scanner.nextLine();
//                        item4 = new Item(newItem, Integer.valueOf(enteredNewQuantity));
//                        items.add(item4);

                        break;
                    case "4":
                        for (int i = 0; i < items.size(); i++) {
                            Item item7 = items.get(i);
                            int numb = i + 1;
                            System.out.printf("%s. [%s] %s\n", numb, item7.quantity, item7.itemName);
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
