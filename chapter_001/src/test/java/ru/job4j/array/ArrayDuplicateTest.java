package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test ArrayDuplicate.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 15.12.2017
 */
public class ArrayDuplicateTest {
    /**
     * Test remove.
     */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
        ArrayDuplicate arr = new ArrayDuplicate();
        String[] array = {"1", "2", "1", "3", "3", "2", "1", "4", "1"};
        array = arr.remove(array);
        String[] expected = {"1", "2", "3", "4"};
        assertThat(array, is(expected));
    }
    /**
     * Test remove.
     */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicateOne() {
        //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
        ArrayDuplicate arr = new ArrayDuplicate();
        String[] array = {"1", "1", "1", "1", "1", "1", "1", "1"};
        array = arr.remove(array);
        String[] expected = {"1"};
        assertThat(array, is(expected));
    }

}
