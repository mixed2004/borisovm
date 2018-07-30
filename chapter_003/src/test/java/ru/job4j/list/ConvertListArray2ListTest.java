package ru.job4j.list;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * class ConvertListArray2ListTest.
 *
 * @author Maxim Borisov (mailto: mixed2004@mail.ru)
 * @version 1
 * @since 30.07.2018
 */
public class ConvertListArray2ListTest {
    /**
     * public void when2on4ArrayListThenList6.
     */
    @Test
    public void when2on4ArrayListThenList6() {
        ConvertListArray2List newList = new ConvertListArray2List();
        List<int[]> list = new ArrayList<>();
        list.add(new int[] {1, 2});
        list.add(new int[] {3, 4, 5, 6});
        List<Integer> expect = Arrays.asList(
                1, 2, 3, 4, 5, 6
        );
        List<Integer> result = newList.convert(list);
        assertThat(result, is(expect));
    }

    /**
     * public void when3on4ArrayListThenList6.
     */
    @Test
    public void when3on4ArrayListThenList6() {
        ConvertListArray2List newList = new ConvertListArray2List();
        List<int[]> list = new ArrayList<>();
        list.add(new int[] {1, 2});
        list.add(new int[] {});
        list.add(new int[]{3, 4, 5, 6});
        List<Integer> expect = Arrays.asList(
                1, 2, 3, 4, 5, 6
        );
        List<Integer> result = newList.convert(list);
        assertThat(result, is(expect));
    }
}