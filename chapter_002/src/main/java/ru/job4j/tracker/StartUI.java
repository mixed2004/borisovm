package ru.job4j.tracker;
/**
 * class StartUI.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 19.02.2018
 */
public class StartUI {
    /**
     * Menu constant for adding a new order.
     */
    private static final String ADD = "0";
    /**
     * The menu constant for displaying all orders.
     */
    private static final String SHOW = "1";
    /**
     * The constant of the menu for editing the order.
     */
    private static final String EDIT = "2";
    /**
     * The menu constant for deleting an order.
     */
    private static final String DELETE = "3";
    /**
     * The constant of the menu to search for an application by ID.
     */
    private static final String FINDBYID = "4";
    /**
     * The constant of the menu to search for an application by name.
     */
    private static final String FINDBYNAME = "5";
    /**
     * The menu constant to exit the loop.
     */
    private static final String EXIT = "6";
    /**
     * Getting data from the user.
     */
    private final Input input;
    /**
     * The order store.
     */
    private final Tracker tracker;
    /**
     * rage of keys.
     */
    private int[] range;

    /**
     * The constructor initializing the field.
     * @param input ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * The main loop.
     */
    public void init() {
        Tracker tracker = new Tracker();
        MenuTracker menu = new MenuTracker(this.input, tracker);
        menu.fillActions();
        range = menu.getActions();
        int[] range =  menu.getActions();
        int key;
        do {
            menu.showMenu();
            key = Integer.valueOf(input.ask("Select: ", range));
            menu.select(key);
        } while (!Integer.valueOf("6").equals(key));
 /*       boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Enter the menu item : ");
            if (ADD.equals(answer)) {
                this.createItem();
            } else if (SHOW.equals(answer)) {
                this.showAllItem();
            } else if (EDIT.equals(answer)) {
                this.editItem();
            } else if (DELETE.equals(answer)) {
                this.deleteItem();
            } else if (FINDBYID.equals(answer)) {
                this.findByIdItem();
            } else if (FINDBYNAME.equals(answer)) {
                this.findByNameItem();
            } else if (EXIT.equals(answer)) {
                exit = true;
            } else {
                continue;
            }
        }
        */
    }

    /**
     * The method realizing the addition of an application to the repository.
     */
    private void createItem() {
        System.out.println("------------ ADD NEW ORDER --------------");
        String name = this.input.ask("input name order :");
        String desc = this.input.ask("input description order :");
        Item item = new Item(name, desc);
        this.tracker.add(item);
        System.out.println("------------ NEW ORDER WITH ID : " + item.getId() + "-----------");
    }
    /**
     * method of searching for all non-zero values.
     */
    private void showAllItem() {
        System.out.println("------------ ALL ORDERS --------------");
        Item[] arrayItems = this.tracker.findAll();
        for (int index = 0; index < arrayItems.length; index++) {
            System.out.println(index + ": " + "id order : " + arrayItems[index].getId() + " " + "name order : "  + arrayItems[index].getName() + " " + "description order: " + arrayItems[index].getDesk() + " " + "created order: " + arrayItems[index].getCreated());
        }
    }
    /**
     * method of replacing an application for an index on a given application.
     */
    private void editItem() {
        System.out.println("------------ EDIT ORDER --------------");
        String id = this.input.ask("input ID order :");
        String name = this.input.ask("input name order :");
        String desc = this.input.ask("input description order :");
        Item item = new Item(name, desc);
        this.tracker.replace(id, item);
        System.out.println("------------ THE ORDER EDITED WITH ID : " + item.getId() + "-----------");
    }
    /**
     * method of deleting an application for an index with a shift.
     */
    private void deleteItem() {
        System.out.println("------------ DELETE ORDER --------------");
        String id = this.input.ask("input ID  order :");
        this.tracker.delete(id);
        System.out.println("------------ DELETED ORDER WITH ID : " + id + "-----------");
    }
    /**
     * method of finding by id.
     */
    private void findByIdItem() {
        System.out.println("------------ FIND BY ID ORDER --------------");
        String id = this.input.ask("input ID  order :");
        Item item = this.tracker.findById(id);
        System.out.println("id order : " + item.getId() + " " + "name order : "  + item.getName() + " " + "description order: " + item.getDesk() + " " + "created order: " + item.getCreated());
    }
    /**
     * method of finding all values with a given name.
     */
    private void findByNameItem() {
        System.out.println("------------ FIND BY NAME ORDER --------------");
        String name = this.input.ask("input name  order :");
        Item[] arrayItems = this.tracker.findByName(name);
        for (int index = 0; index < arrayItems.length; index++) {
            System.out.println(index + ": " + "id order : " + arrayItems[index].getId() + " " + "name order : "  + arrayItems[index].getName() + " " + "description order: " + arrayItems[index].getDesk() + " " + "created order: " + arrayItems[index].getCreated());
        }
    }
    /**
     * method show menu.
     */
    private void showMenu() {
        System.out.println("MENU.");
        System.out.println("0. Add new item.");
        System.out.println("1. Show all items ");
        System.out.println("2. Edit item.");
        System.out.println("3. Delete item.");
        System.out.println("4. Find item by Id.");
        System.out.println("5. Find items by name.");
        System.out.println("6. Exit Program.");
        System.out.println("SELECT: ");
    }

    /**
     * Start the program.
     * @param args args
     */
    public static void main(String[] args) {
        new StartUI(new ValidateInput(), new Tracker()).init();
    }
}
