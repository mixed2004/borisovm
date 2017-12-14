package ru.job4j.array;
/**
 * переворот в массиве.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 14.12.2017
 */
public class Turn {
    /**
     * Method back переворот массива.
     *
     * @param array  массив
     * @return array результирующий массив
     */
    public int[] back(int[] array) {
        //временная ппеременная
        int temp;
        for (int i = 0; i != array.length / 2; i++) {
            temp = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
