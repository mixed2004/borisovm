package ru.job4j.list;

import java.util.List;

/**
 * class ConvertList2Array.
 *
 * @author Maxim Borisov (mailto: mixed2004@mail.ru)
 * @version 1
 * @since 26.07.2018
 */
public class ConvertList2Array {
    /**
     * The method of converting a list into a two-dimensional array into equal rows.
     * @param list initial list
     * @param rows number of rows
     * @return array
     */
    public int[][] toArray(List<Integer> list, int rows) {
        int cells = list.size() / rows;
        if (list.size() % cells != 0) {
            cells++;
        }
        int[][] array = new int[rows][cells];
        for (Integer listvalue : list) {
            array[list.indexOf(listvalue) / cells][list.indexOf(listvalue) % cells] = listvalue;
        }
        return array;
    }
}
