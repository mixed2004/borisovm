package ru.job4j.sortusercomparator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * class SortUserComparatorTest.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 04.08.2018
 */
public class SortUserComparatorTest {
    /**
     * public void when3SortNameLengthThen3SortNameLength.
     */
    @Test
    public void when3SortNameLengthThen3SortNameLength() {
        SortUser sortUser = new SortUser();
        List<User> users = new ArrayList<>();
        User user1 = new User("Maxim", 35);
        User user2 = new User("Alex", 32);
        User user3 = new User("Stanislav", 40);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        List<User> resultList = new ArrayList<>();
        resultList.addAll(sortUser.sortNameLength(Arrays.asList(user1, user2, user3)));
        List<User> expectedtList = new ArrayList<>();
        expectedtList.addAll(Arrays.asList(user2, user1, user3));
        assertThat(resultList, is(expectedtList));
    }
    /**
     * public void when4SortNameAgeThen4SortNameAge.
     */
    @Test
    public void when4SortNameAgeThen4SortNameAge() {
        SortUser sortUser = new SortUser();
        List<User> users = new ArrayList<>();
        User user1 = new User("Maxim", 35);
        User user2 = new User("Maxim", 5);
        User user3 = new User("Alex", 32);
        User user4 = new User("Alex", 40);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        List<User> resultList = new ArrayList<>();
        resultList.addAll(sortUser.sortByAllFields(Arrays.asList(user1, user2, user3, user4)));
        List<User> expectedtList = new ArrayList<>();
        expectedtList.addAll(Arrays.asList(user3, user4, user2, user1));
        assertThat(resultList, is(expectedtList));
    }
}
