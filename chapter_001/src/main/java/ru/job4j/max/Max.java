package ru.job4j.max;

/**
 * программа возврата максимального из двух чисел.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 04.10.2017
 */

public class Max {
    /**
     * метод возврата максимального из двух чисел.
     *
     * @param first  первый аргумент
     * @param second второй аргумент
     * @return max
     */
    public int max(int first, int second) {
        return first > second ? first : second;
    }
}
