package ru.job4j.array;
/**
 * заполнение матрицы- таблицы умножения заданной размерностью.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 17.12.2017
 */
public class Matrix {
    /**
     * Method multiple таблица умножения.
     *
     * @param size  массив размерностью size*size
     * @return array результативный массив
     */
    int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i != array.length; i++) {
            for (int j = 0; j != array.length; j++) {
                    array[i][j] = (i + 1) * (j + 1);
                }
            }
        return array;
    }
}
