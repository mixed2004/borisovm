package ru.job4j.tracker;

import java.util.List;
import java.util.function.Consumer;

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
    private Tracker tracker = new Tracker();
    /**
     * rage of keys.
     */
    private int[] range;
    /**
     *функциональный интерфейс Consumer.
     */
    private final Consumer<String> output;

    /**
     * The constructor initializing the field.
     * @param input ввод данных.
     * @param tracker хранилище заявок.
     */

    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
        output = null;
    }

    /**
     * The constructor initializing the field.
     * @param input input
     * @param tracker tracker
     * @param output output
     */
    public StartUI(Input input, Tracker tracker, Consumer<String> output) {
        this.input = input;
        this.tracker = tracker;
        this.output = output;
    }
    /**
     * The main loop.
     */
    public void init() {
//        Tracker tracker = new Tracker();
        MenuTracker menu = new MenuTracker(this.input, tracker, output);
        menu.fillActions();
        range = menu.getActions();
        int[] range =  menu.getActions();
        int key;
        do {
            menu.showMenu();
            key = Integer.valueOf(input.ask("Select: ", range));
            menu.select(key);
        } while (!Integer.valueOf("6").equals(key));
     }

    /**
     * The method realizing the addition of an application to the repository.
     */
    private void createItem() {
        output.accept("------------ ADD NEW ORDER --------------");
        String name = this.input.ask("input name order :");
        String desc = this.input.ask("input description order :");
        Item item = new Item(name, desc);
        this.tracker.add(item);
        output.accept("------------ NEW ORDER WITH ID : " + item.getId() + "-----------");
    }
    /**
     * method of searching for all non-zero values.
     */
    private void showAllItem() {
        output.accept("------------ ALL ORDERS --------------");
        List<Item> arrayItems = this.tracker.findAll();
        for (Item item: arrayItems) {
            output.accept(" id order : " + item.getId() + " " + "name order : "  + item.getName() + " " + "description order: " + item.getDesk() + " " + "created order: " + item.getCreated());
        }
    }
    /**
     * method of replacing an application for an index on a given application.
     */
    private void editItem() {
        output.accept("------------ EDIT ORDER --------------");
        String id = this.input.ask("input ID order :");
        String name = this.input.ask("input name order :");
        String desc = this.input.ask("input description order :");
        Item item = new Item(name, desc);
        this.tracker.replace(id, item);
        output.accept("------------ THE ORDER EDITED WITH ID : " + item.getId() + "-----------");
    }
    /**
     * method of deleting an application for an index with a shift.
     */
    private void deleteItem() {
        output.accept("------------ DELETE ORDER --------------");
        String id = this.input.ask("input ID  order :");
        this.tracker.delete(id);
        output.accept("------------ DELETED ORDER WITH ID : " + id + "-----------");
    }
    /**
     * method of finding by id.
     */
    private void findByIdItem() {
        output.accept("------------ FIND BY ID ORDER --------------");
        String id = this.input.ask("input ID  order :");
        Item item = this.tracker.findById(id);
        output.accept("id order : " + item.getId() + " " + "name order : "  + item.getName() + " " + "description order: " + item.getDesk() + " " + "created order: " + item.getCreated());
    }
    /**
     * method of finding all values with a given name.
     */
    private void findByNameItem() {
        output.accept("------------ FIND BY NAME ORDER --------------");
        String name = this.input.ask("input name  order :");
        List<Item> arrayItems = this.tracker.findByName(name);
        for (Item item: arrayItems) {
            output.accept("id order : " + item.getId() + " " + "name order : "  + item.getName() + " " + "description order: " + item.getDesk() + " " + "created order: " + item.getCreated());
        }
    }

   /**
     * method show menu.
     */
   /*
    private void showMenu() {
        output.accept("MENU.");
        output.accept("0. Add new item.");
        output.accept("1. Show all items ");
        output.accept("2. Edit item.");
        output.accept("3. Delete item.");
        output.accept("4. Find item by Id.");
        output.accept("5. Find items by name.");
        output.accept("6. Exit Program.");
        output.accept("SELECT: ");
    }
*/
    /**
     * Start the program.
     * @param args args
     */
    public static void main(String[] args) {
        new StartUI(new ValidateInput(new ConsoleInput()), new Tracker()).init();
    }
}
