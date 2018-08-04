package ru.job4j.sortusercomparator;

import java.util.List;
/**
 * class SortUser.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 04.08.2018
 */
public class SortUser {
    /**
     * method sorting List of Users with comparator by name length.
     * @param list list users
     * @return TreeSet users
     */
    public List<User> sortNameLength(List<User> list) {
        list.sort(new UserNameLengthComparator());
        return list;
    }
    /**
     * method sorting List of Users with comparator by all fields.
     * @param list list users
     * @return TreeSet users
     */
    public List<User> sortByAllFields(List<User> list) {
        list.sort(new UserNameComparator().thenComparing(new UserAgeComparator()));
        return list;
    }
}
