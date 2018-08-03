package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * class Tracker.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 17.02.2018
 */
public class Tracker {
    /**
     * creating array of 100 objects Item.
     */
    private List<Item> items = new ArrayList<>();
    /**
     * The cell pointer for the new application.
     */
    private int position = 0;
    /**
     * creating a random number object.
     */
    private static final Random RN = new Random();
    /**
     * creating a time date object.
     */
    private static final  Date DATE = new Date();
    /**
     * The method realizing the addition of an application to the repository.
     * @param item новая заявка
     * @return item item
     */
    public Item add(Item item) {

        item.setId(this.generateId());
        item.setCreated(this.generatedDate());
        this.items.add(item);
        return item;
    }
    /**
     * The method generates a unique key for the application.
     * Since the application does not have the uniqueness of the fields, the name and description. For identification, we need a unique key.
     * @return Уникальный ключ.
     */
    private String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt(100));
    }
    /**
     * The method generates a Time Date for the application.
     * @return time.
     */
    private long generatedDate() {
        return DATE.getTime();
    }

    /**
     * method of replacing an application for an index on a given application.
     * @param id findin id.
     * @param item resalt item in array of items whith find id.
     */
    public void replace(String id, Item item) {
        for (int i = 0; i <  this.items.size(); i++) {
            if (items.get(i) != null && items.get(i).getId().equals(id)) {
                item.setId(id);
                this.items.set(i, item);
                break;
            }
        }
    }

    /**
     * method of deleting an application for an index with a shift.
     * @param id finding id.
     */
    public void delete(String id) {
        for (int i = 0; i <  this.items.size(); i++) {
            if (items.get(i) != null && items.get(i).getId().equals(id)) {
                this.items.remove(i);
                break;
            }
        }
    }
    /**
     * method of searching for all non-zero values.
     * @return array.
     */
    public List<Item> findAll() {
        List<Item> result = new ArrayList<>();
        for (Item item: items) {
            if (item != null) {
                result.add(item);
            }
        }
        return result;
    }
    /**
     * method of finding all values with a given name.
     * @param key findingName
     * @return array.
     */
    public List<Item> findByName(String key) {
        List<Item> result = new ArrayList<>();
        for (Item item: items) {
            if (item.getName().equals(key)) {
                result.add(item);
            }
        }
        return result;
    }

    /**
     * method of finding by id.
     * @param id finding id
     * @return item object of finding
     */
    public Item findById(String id) {
        Item resalt = null;
        for (Item item:items) {
            if (item != null && item.getId().equals(id)) {
                resalt = item;
                break;
            }
        }
        return resalt;
    }
}