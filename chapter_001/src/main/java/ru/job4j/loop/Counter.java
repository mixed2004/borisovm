package ru.job4j.loop;

/**
 * подсчет суммы четных чисел.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 01.12.2017
 */

public class Counter {

    /**
     * Method add сложение четных чисел.
     *
     * @param start  начало отсчета
     * @param finish конец отсчета
     * @return result результат сложения
     */
    public int add(int start, int finish) {
        int result = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                result += i;
            }
        }
        return result;
    }
}