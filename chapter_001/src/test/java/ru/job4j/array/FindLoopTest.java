package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 13.12.2017
 */
public class FindLoopTest {
    /**
     * Test indexOf.
     */
    @Test
    public void whenArrayWithTwoThenArraygWithTwoIndex() {
        FindLoop arr = new FindLoop();
        int[] firstArray = {1, 4, 2, 3};
        int result = arr.indexOf(firstArray, 2);
        assertThat(result, is(2));
    }
    /**
     * Test indexOf.
     */
    @Test
    public void whenArrayWithNoElementThenReturnMimusOne() {
        FindLoop arr = new FindLoop();
        int[] firstArray = {1, 4, 2, 3};
        int result = arr.indexOf(firstArray, 5);
        assertThat(result, is(-1));
    }
}
