package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name : ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);

            } else if (select == 3) {
                System.out.println("=== Delete id ===");
                System.out.print("Enter id : ");
                String id = scanner.nextLine();
                tracker.delete(id);
                if (tracker.delete(id)) {

                    System.out.println("Deletion succeed");

                } else {

                    System.out.println("Invalid id");

                }
            } else if (select == 1) {
                System.out.println("=== Show all items ===");
                System.out.print("Enter items : ");
                Item[] items = tracker.findAll();
                for (int index = 0; index < items.length; index++) {
                    System.out.println(items[index]);
                    if (items[index] == null) {
                        System.out.println("items not found");
                    }
                }
            } else if (select == 5) {
                System.out.println("=== Find items by name ===");
                System.out.print("Enter name : ");
                Item[] items = tracker.findByName("name");
                for (int index = 0; index < items.length; index++) {
                    System.out.println(items[index]);
                    if (items.length == 0) {
                        System.out.println("items not name");
                    }
                }
            } else if (select == 4) {
                System.out.println("=== Find items by ID ===");
                System.out.println(" Enter ID : ");
                String id = scanner.nextLine();
                Item rsl = tracker.findById(id);
                if (rsl != null) {
                    System.out.println(rsl.getId() + " " + rsl.getName());
                } else {
                    System.out.println("Item not found.");
                }

            } else if (select == 2) {
                System.out.println("=== replace Item === ");
                System.out.println(" Please enter id: ");
                String id = scanner.nextLine();
                System.out.println(" Item name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("Item successfully replaced");
                } else {
                    System.out.println("Replacing is fallen. Invalid id. Please try again");
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

}