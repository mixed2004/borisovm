package ru.job4j.addresslist;

/**
 * class Address.
 *
 * @author Maxim Borisov (mailto: mixed2004@mail.ru)
 * @version 1
 * @since 15.04.2019
 */
public class Address {
    /**
     * parametr city.
     */
    private String city;
    /**
     * parametr street.
     */
    private String street;
    /**
     * parametr home.
     */
    private int home;
    /**
     * parametr apartment.
     */
    private int apartment;

    /**
     * construktor for Address.
     * @param city city
     * @param street street
     * @param home home
     * @param apartment aparrtment
     */
    public Address(String city, String street, int home, int apartment) {
        this.city = city;
        this.street = street;
        this.home = home;
        this.apartment = apartment;
    }

    /**
     * getter for city.
     * @return city
     */
    public String getCity() {
        return city;
    }
    /**
     * getter for street.
     * @return street
     */
    public String getStreet() {
        return street;
    }
    /**
     * getter for home.
     * @return home
     */
    public int getHome() {
        return home;
    }
    /**
     * getter for apartment.
     * @return apartment
     */
    public int getApartment() {
        return apartment;
    }
}
