package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 06.12.2017
 */
public class PaintTest {
    /**
     * Test piramid.
     */
    @Test
    public void whenPiramidWithHeightTwoThenStringWithTwoRows() {
        Paint paint = new Paint();
        String result = paint.piramid(2);
        final String ln = System.getProperty("line.separator");
        String expected = String.format(" ^ %s^^^%s", ln, ln);
        assertThat(result, is(expected));
    }
    /**
     * Test piramid.
     */
    @Test
    public void whenPiramidWithHeightThreeThenStringWithThreeRows() {
        Paint paint = new Paint();
        String result = paint.piramid(3);
        final String ln = System.getProperty("line.separator");
        String expected = String.format("  ^  %s ^^^ %s^^^^^%s", ln, ln, ln);
        assertThat(result, is(expected));
    }
}
