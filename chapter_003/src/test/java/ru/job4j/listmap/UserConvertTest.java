package ru.job4j.listmap;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * public class UserConvertTest.
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 03.08.2018
 */
public class UserConvertTest {
    /**
     * public void when2ConvertThen2().
     */
    @Test
    public void when2ConvertThen2() {
        UserConvert userConvert = new UserConvert();
        List<User> users = new ArrayList<>();
        User user1 = new User("Maxim", "Kazan");
        User user2 =  new User("Alex", "Zelenodolsk");
        users.add(user1);
        users.add(user2);
        HashMap<Integer, User> resultMap = userConvert.process(users);
        HashMap<Integer, User> expectedtMap = new HashMap<>();
        expectedtMap.put(user1.getId(), user1);
        expectedtMap.put(user2.getId(), user2);
        assertThat(resultMap, is(expectedtMap));
    }
}
