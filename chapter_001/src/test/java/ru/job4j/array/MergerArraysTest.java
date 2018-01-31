package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test MergerArrays.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 31.01.2018
 */

public class MergerArraysTest {
    /**
     * Test mergerArraysSort.
     */
    @Test
    public void whenArraySortOnePlusArraySortTwoThenTurnedArrayWhithSortElementTestOne() {
        MergerArrays arr = new MergerArrays();
        int[] firstArray = {1, 1, 2, 2, 3};
        int[] secondArray = {1, 2, 3, 5, 7, 9};
        int[] array = arr.mergerArraysSort(firstArray, secondArray);
        int[] expected = {1, 1, 1, 2, 2, 2, 3, 3, 5, 7, 9};
        assertThat(array, is(expected));
    }
    /**
     * Test mergerArraysSort.
     */
    @Test
    public void whenArraySortOnePlusArraySortTwoThenTurnedArrayWhithSortElementTestTwo() {
        MergerArrays arr = new MergerArrays();
        int[] firstArray = {2, 3, 4, 5, 7, 8};
        int[] secondArray = {0, 6, 10};
        int[] array = arr.mergerArraysSort(firstArray, secondArray);
        int[] expected = {0, 2, 3, 4, 5, 6, 7, 8, 10};
        assertThat(array, is(expected));
    }
    /**
     * Test mergerArraysSort.
     */
    @Test
    public void whenArraySortOnePlusArraySortTwoThenTurnedArrayWhithSortElementTestThree() {
        MergerArrays arr = new MergerArrays();
        int[] firstArray = {2, 3, 4, 5, 7, 8};
        int[] secondArray = {6};
        int[] array = arr.mergerArraysSort(firstArray, secondArray);
        int[] expected = {2, 3, 4, 5, 6, 7, 8};
        assertThat(array, is(expected));
    }
}
