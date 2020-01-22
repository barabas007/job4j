package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }


    //  0. Add new Item
    //1. Show all items
    //2. Edit item
    //3. Delete item
    //4. Find item by Id
    //5. Find items by name
    //6. Exit Program

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = false;
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
            } else if (select == 4) {
                System.out.println("=== Find items by name ===");
                System.out.print("Enter name : ");
                Item[] items = tracker.findByName("name");
                for (int index = 0; index < items.length; index++) {
                    System.out.println(items[index]);
                    if (items.length == 0 ) {
                        System.out.println("items not name");
                    }
                }
            } else if (select == 6) {
                run = false;
            }

            private void showMenu () {
                System.out.println("Menu.");
                System.out.println("Add new Item");
                System.out.println(" Show all items");
                System.out.println("Edit item");
                System.out.println(" Delete item");
                System.out.println(" Find item by Id");
                System.out.println("Find items by name");
                System.out.println(" Exit Program");
            }


        }
    }
}
