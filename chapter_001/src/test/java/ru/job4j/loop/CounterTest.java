package ru.job4j.loop;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 01.12.2017
 */

public class CounterTest {
    /**
     * Test add.
     */
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter sum = new Counter();
        assertThat(sum.add(1, 10), is(30));
    }



}