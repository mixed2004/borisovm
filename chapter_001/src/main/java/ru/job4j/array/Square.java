package ru.job4j.array;
/**
 * заполнение массива степенью числа 2.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 11.12.2017
 */
public class Square {
    /**
     * Method calculate cntgtym числа.
     *
     * @param bound  массив размерностью bound
     * @return rst результативный массив
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        //заполнение массива степенью числа 2
        for (int i = 1; i != rst.length + 1; i++) {
            rst[i - 1] = (int) Math.pow(i, 2);
        }
        return rst;
    }
}
