package ru.job4j.tracker;

import java.util.Arrays;
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
    private Item[] items = new Item[100];
    /**
     * The cell pointer for the new application.
     */
    private int position = 0;
    /**
     * creating a random number object.
     */
    private static final Random RN = new Random();
    /**
     * The method realizing the addition of an application to the repository.
     * @param item новая заявка
     * @return item item
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
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
     * method of replacing an application for an index on a given application.
      * @param id findin id.
     * @param item resalt item in array of items whith find id.
     */
    public void replace(String id, Item item) {
        for (int index = 0; index != this.position; index++) {
            if (items[index] != null && items[index].getId().equals(id)) {
                items[index] = item;
                break;
            }
        }
    }

    /**
     * method of deleting an application for an index with a shift.
     * @param id finding id.
     */
    public void delete(String id) {
        for (int index = 0; index != this.position; index++) {
            if (items[index] != null && items[index].getId().equals(id)) {
                items[index] = null;
                if (index < items.length - 1) {
                    System.arraycopy(items, index + 1, items, index, this.position - index);
                }
                items[position - 1] = null;
                this.position--;
                break;
            }
        }
    }
    /**
     * method of searching for all non-zero values.
     * @return array.
     */
    public Item[] findAll() {
        Item[] result = new Item[this.position];
        int numberNotNullElements = 0;
        for (int index = 0; index != this.position; index++) {
            if (items[index] != null) {
                result[index] = this.items[index];
                numberNotNullElements++;
            }
        }
        return Arrays.copyOf(result, numberNotNullElements);
    }
    /**
     * method of finding all values with a given name.
     * @param key findingName
     * @return array.
     */
    public Item[] findByName(String key) {
        Item[] result = new Item[this.position];
        int numberOfElements = 0;
        for (int index = 0; index != this.position; index++) {
            if (items[index].getName().equals(key)) {
                result[index] = this.items[index];
                numberOfElements++;
            }
        }
        return Arrays.copyOf(result, numberOfElements);
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