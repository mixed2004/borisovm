package ru.job4j.matrixtolist;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * class MatrixToList.
 *
 * @author Maxim Borisov (mailto: mixed2004@mail.ru)
 * @version 1
 * @since 01.07.2019
 */
public class MatrixToList {
    /**
     * method convert matrix to list.
     * @param matrix matrix
     * @return list
     */
    public List<Integer> matrixToList(Integer[][] matrix) {
        return Stream.of(matrix).flatMap(x -> Stream.of(x)).collect(Collectors.toList());
    }
}