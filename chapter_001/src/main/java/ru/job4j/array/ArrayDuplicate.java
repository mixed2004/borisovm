package ru.job4j.array;

import java.util.Arrays;

/**
 *удаление из массива строк дубликатов.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 2
 * @since 18.12.2017
 */
public class ArrayDuplicate {
    /**
     * Method remove delete dublicate.
     *
     * @param array массив размерностью size*size
     * @return array результативный массив
     */
      public String[] remove(String[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                 if (array[i].equals(array[j])) {
                   array[j] = array[length - 1];
                   length--;
                   j--;
                    }
                }
            }
        return Arrays.copyOf(array, length);
    }
}
