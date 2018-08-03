package ru.job4j.listmap;

import java.util.HashMap;
import java.util.List;

/**
 * class UserConvert.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 03.08.2018
 */
public class UserConvert {
    /**
     *list-to-map conversion method.
     * @param list list of users.
     * @return map
     */
    public HashMap<Integer, User> process(List<User> list) {
        HashMap<Integer, User> hashMap = new HashMap<>();
        for (User user: list) {
           hashMap.put(user.getId(), user);
        }
        return hashMap;
    }
}
