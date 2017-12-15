package ru.job4j.array;
/**
 * сортировка в массиве методом пузырька.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 15.12.2017
 */
public class BubbleSort {
    /**
     * Methot sort сортировка одномерного массива.
     *
     *@param array исходный массив
     *@return array отсортированный массив
     */
    public int[] sort(int[] array) {
        int tmp; // вспомогательная переменная для перестановки.
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                  if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }
}