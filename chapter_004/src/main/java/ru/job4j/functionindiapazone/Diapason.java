package ru.job4j.functionindiapazone;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * class Diapason.
 *
 * @author Maxim Borisov (mailto: mixed2004@mail.ru)
 * @version 1
 * @since 17.01.2019
 */
public class Diapason {
    /**
     * finction diapason.
     * @param start start index diapason
     * @param end finish index diapason
     * @param func function
     * @return list of function return in diapason
     */
    public List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            list.add(func.apply((double) i));
        }
        return list;
    }
}
