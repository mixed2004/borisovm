package ru.job4j.addresslist;

/**
 * class profile.
 */
public class Profile {

    /**
     * address.
     */
    private Address address;

    /**
     * constructor for profile.
     */
    public Profile() {
    }

    /**
     * constructor for profile.
     * @param address address
     */
    public Profile(Address address) {
        this.address = address;
    }

    /**
     * getter for address.
     * @return address
     */
    public Address getAddress() {
        return address;
    }
}
