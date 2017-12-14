package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 14.12.2017
 */
public class TurnTest {
    /**
     * Test back.
     */
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        //напишите здесь тест, проверяющий переворот массива с чётным числом элементов, например {2, 6, 1, 4}.
        Turn arr = new Turn();
        int[] firstArray = {2, 6, 1, 4};
        firstArray = arr.back(firstArray);
        int[] result = {4, 1, 6, 2};
        assertThat(firstArray, is(result));
    }
    /**
     * Test back.
     */
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        //напишите здесь тест, проверяющий переворот массива с нечётным числом элементов, например {1, 2, 3, 4, 5}.
        Turn arr = new Turn();
        int[] firstArray = {1, 2, 3, 4, 5};
        firstArray = arr.back(firstArray);
        int[] result = {5, 4, 3, 2, 1};
        assertThat(firstArray, is(result));
    }
}
