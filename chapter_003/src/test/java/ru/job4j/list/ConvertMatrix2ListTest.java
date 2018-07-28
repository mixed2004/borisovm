package ru.job4j.list;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * class ConvertMatrix2ListTest.
 *
 * @author Maxim Borisov (mailto: mixed2004@mail.ru)
 * @version 1
 * @since 28.07.2018
 */
public class ConvertMatrix2ListTest {
    /**
     * public void when2on2ArrayThenList4 test.
     */
    @Test
    public void when2on2ArrayThenList4() {
        ConvertMatrix2List list = new ConvertMatrix2List();
        int[][] input = {
                {1, 2},
                {3, 4}
        };
        List<Integer> expect = Arrays.asList(
                1, 2, 3, 4
        );
        List<Integer> result = list.toList(input);
        assertThat(result, is(expect));
    }

    /**
     * public void when3on3ArrayThenList9 test.
     */
    @Test
    public void when3on3ArrayThenList9() {
        ConvertMatrix2List list = new ConvertMatrix2List();
        int[][] input = {
                {1, 2, 3},
                {3, 4, 5},
                {6, 0, 7}
        };
        List<Integer> expect = Arrays.asList(
                1, 2, 3, 3, 4, 5, 6, 0, 7
        );
        List<Integer> result = list.toList(input);
        assertThat(result, is(expect));
    }
}
