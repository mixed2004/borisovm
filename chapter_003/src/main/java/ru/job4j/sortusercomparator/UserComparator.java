package ru.job4j.sortusercomparator;

import java.util.Comparator;
/**
 * class UserComparator.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 04.08.2018
 */

/**
 * class UserNameComparator implements Comparator<User>.
 */
class UserNameComparator implements Comparator<User> {
    /**
     * comparator defolt by name.
     * @param a 1 user.
     * @param b 2 user
     * @return int result of compare
     */
    public int compare(User a, User b) {

        return a.getName().compareTo(b.getName());
    }
}

/**
 * class UserNameLengthComparator implements Comparator<User>.
 */
class UserNameLengthComparator implements Comparator<User> {
    /**
     * comparator by name.
     * @param a 1 user.
     * @param b 2 user
     * @return int result of compare
     */
    public int compare(User a, User b) {

        return a.getName().length() - b.getName().length();
    }
}

/**
 * class UserAgeComparator implements Comparator<User>.
 */
class UserAgeComparator implements Comparator<User> {

    /**
     * comparator by age.
     * @param a 1 user.
     * @param b 2 user
     * @return int result of compare
     */
    public int compare(User a, User b) {

        return a.getAge() - b.getAge();
    }
}

