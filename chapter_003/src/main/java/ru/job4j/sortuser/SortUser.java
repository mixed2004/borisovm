package ru.job4j.sortuser;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * class SortUser.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 04.08.2018
 */
public class SortUser {
    /**
     * method sorting List of Users with comparator.
     * @param list list users
     * @return TreeSet users
     */
    public Set<User> sort(List<User> list) {
        Set<User> users = new TreeSet<User>();
        users.addAll(list);
        return users;
    }
}
