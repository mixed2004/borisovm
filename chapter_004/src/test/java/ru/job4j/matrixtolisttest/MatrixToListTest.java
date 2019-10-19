package ru.job4j.matrixtolisttest;
import org.junit.Test;
import ru.job4j.matrixtolist.MatrixToList;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * class MatrixToListTest.
 *
 * @author Maxim Borisov (mailto: mixed2004@mail.ru)
 * @version 1
 * @since 15.04.2019
 */
public class MatrixToListTest {
    /**
     * test.
     */
    @Test
    public void matrixConvertToListThenList() {
        MatrixToList matrixToList = new MatrixToList();
        Integer[][] matrix = {{1, 2}, {3, 4}, {5, 6}};
        List<Integer> expect = Arrays.asList(1, 2, 3, 4, 5, 6);
        assertThat(matrixToList.matrixToList(matrix), is(expect));
    }
}
