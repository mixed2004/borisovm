package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test Matrix.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 17.12.2017
 */
public class MatrixTest {
    /**
     * Test multiply.
     */
    @Test
    public void whenArrayWithSizeThreeThenTurnedSquareArrayWhithThreeXThree() {
        Matrix arr = new Matrix();
        int[][] result = arr.multiple(3);
        int[][] expected = {
                {1, 2, 3},
                {2, 4, 6},
                {3, 6, 9}
        };
        assertThat(result, is(expected));
    }
    /**
     * Test multiply.
     */
    @Test
    public void whenArrayWithSizeFourThenTurnedSquareArrayWhithFourXFour() {
        Matrix arr = new Matrix();
        int[][] result = arr.multiple(4);
        int[][] expected = {
                {1, 2, 3, 4},
                {2, 4, 6, 8},
                {3, 6, 9, 12},
                {4, 8, 12, 16}
        };
        assertThat(result, is(expected));
    }
}
