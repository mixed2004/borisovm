package ru.job4j.sortuser;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * class SortUserTest.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 04.08.2018
 */
public class SortUserTest {
    /**
     * public void when2SortByAgeThen2SortByAge.
     */
    @Test
    public void when2SortByAgeThen2SortByAge() {
        SortUser sortUser = new SortUser();
        List<User> users = new ArrayList<>();
        User user1 = new User("Maxim", 35);
        User user2 = new User("Alex", 32);
        User user3 = new User("Stas", 40);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        List<User> resultList = new ArrayList<>();
        resultList.addAll(sortUser.sort(Arrays.asList(user1, user2, user3)));
        List<User> expectedtList = new ArrayList<>();
        expectedtList.addAll(Arrays.asList(user2, user1, user3));
        assertThat(resultList, is(expectedtList));
    }
}