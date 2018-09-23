package ru.job4j.bank;

import java.util.Objects;

/**
 * class User.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 12.09.2018
 */
public class User {
    /**
     * name user.
     */
    private String name;

    /**
     * passport user.
     */
    private String passport;

    /**
     * consractor for User.
     * @param name name
     * @param passport passport
     */
    public User(String name, String passport) {
        this.name = name;
        this.passport = passport;
    }

    /**
     * getter for passport.
     * @return passport
     */
    public String getPassport() {
        return passport;
    }

    /**
     * setter for passport.
     * @param passport passport
     */
    public void setPassport(String  passport) {
        this.passport = passport;
    }

    /**
     * getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * setter for name.
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return getPassport() == user.getPassport() && Objects.equals(getName(), user.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPassport());
    }
}
