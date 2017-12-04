package ru.job4j.loop;
/**
 * подсчет факториала до числа n.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 03.12.2017
 */
public class Factorial {
    /**
     * Method calc факториал числа.
     *
     * @param n  расчет факториала до числа
     * @return result результат факториала
     */
    public int calc(int n) {
        int result = 1;
          for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
}
