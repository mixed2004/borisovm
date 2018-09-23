package ru.job4j.bank;

/**
 * class Account.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 12.09.2018
 */
public class Account {
    /**
     * value account.
     */
    private double value;
    /**
     * requisites.
     */
    private int requisites;

    /**
     * constractor for account.
     * @param value value
     * @param requisites requisites
     */
    public Account(double value, int requisites) {
        this.value = value;
        this.requisites = requisites;
    }

    /**
     * getter for value.
     * @return value
     */
    public double getValue() {
        return value;
    }

    /**
     * setter for value.
     * @param value value
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * getter for requisites.
     * @return requisites
     */
    public int getRequisites() {
        return requisites;
    }

    /**
     * setter forrequisites.
     * @param requisites requisites
     */
    public void setRequisites(int requisites) {
        this.requisites = requisites;
    }
}
