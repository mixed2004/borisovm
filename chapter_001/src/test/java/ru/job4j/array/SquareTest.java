package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 11.12.2017
 */
public class SquareTest {
    /**
     * Test calculate.
     */
    @Test
    public void whenArrayWithTwoThenArraygWithTwoMembers() {
        Square arr = new Square();
        int[] result = arr.calculate(2);
        int[] expected = {1, 4};
        assertThat(result, is(expected));
    }
    /**
     * Test calculate.
     */
    @Test
    public void whenArrayWithFourThenArraygWithFourMembers() {
        Square arr = new Square();
        int[] result = arr.calculate(4);
        int[] expected = {1, 4, 9, 16};
        assertThat(result, is(expected));
    }
}
