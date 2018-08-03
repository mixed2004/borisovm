package ru.job4j.listmap;

import java.util.Random;
/**
 * class User.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 03.08.2018
 */
public class User {
    /**
     * the unique key.
     */
    private int id;
    /**
     * name of user.
     */
    private  String name;
    /**
     * city of user.
     */
    private String city;
    /**
     * creating a random number user.
     */
    private static final Random RN = new Random();

    /**
     * constractor for user.
     * @param name name
     * @param city city
     */
    public User(String name, String city) {
        this.id = generateId();
        this.name = name;
        this.city = city;
    }

    /**
     * method of getting id.
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * method of getting name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * method of setting name.
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * method  of getting city.
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * method of setting city.
     * @param city city
     */
    public void setCity(String city) {
        this.city = city;
    }
    /**
     * The method generates a unique key for the user.
     * Since the application does not have the uniqueness of the fields, the name and description. For identification, we need a unique key.
     * @return unique id.
     */
    private int generateId() {
        return (int) (System.currentTimeMillis() + RN.nextInt(100));
    }
}
