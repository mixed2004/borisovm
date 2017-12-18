package ru.job4j.array;

import java.util.Arrays;

/**
 *удаление из массива строк дубликатов.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 18.12.2017
 */
public class ArrayDuplicate {
    /**
     * Method remove delete dublicate.
     *
     * @param array  массив размерностью size*size
     * @return array результативный массив
     */
    public String[] remove(String[] array) {
        String expectedEqual;
        int endOfArray = array.length;
        for (int i = 0; i < endOfArray - 1; i++) {
            expectedEqual = array[i];
            for (int j = i + 1; j < endOfArray; j++) {
                if (expectedEqual.equals(array[j])) {
//переставляем все элемены на единицу влево
                    for (int k = j; k < endOfArray - 1; k++) {
                        array[k] = array[k + 1];
                    }
                    endOfArray--;
                    j--;
                }

            }

        }
        return Arrays.copyOf(array, endOfArray);
    }
}
