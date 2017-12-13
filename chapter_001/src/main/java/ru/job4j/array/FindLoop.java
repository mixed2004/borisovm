package ru.job4j.array;
/**
 * поиск индекса в массиве по элементу.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 13.12.2017
 */
public class FindLoop {
    /**
     * Method indexOf поиск индекса числа.
     *
     * @param data  массив
     * @param el искомый элемент
     * @return rsl индекс жлемента в массиве
     */
    public int indexOf(int[] data, int el) {
        int rsl = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index != data.length; index++) {
            if (data[index] == el) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }
}
