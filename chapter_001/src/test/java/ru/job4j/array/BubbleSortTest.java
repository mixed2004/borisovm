package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 15.12.2017
 */
public class BubbleSortTest {
    /**
     * Test sort.
     */
    @Test
    public void whenArrayWithUnsortelementThenTurnedArrayWhithSortelement() {
        BubbleSort arr = new BubbleSort();
        int[] array = {2, 6, 1, 4, 3, 5};
        array = arr.sort(array);
        int[] result = {1, 2, 3, 4, 5, 6};
        assertThat(result, is(array));
    }
}
