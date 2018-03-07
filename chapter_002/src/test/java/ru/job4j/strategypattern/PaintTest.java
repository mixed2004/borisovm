package ru.job4j.strategypattern;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.After;
import org.junit.Before;
/**
 * class PaintTest test for Paint.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 2
 * @since 25.02.2018
 */
public class PaintTest {
    /**
     *The field contains the default output to the console.
     */
    private final PrintStream stdout = System.out;
    /**
     *buffer for the result.
     */
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    /**
     * The method of replacing standard output with output to memory for testing.
     */
    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }

    /**
     * method of returning output to the console.
     */
    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }

    /**
     * Test paint square.
     */
    @Test
    public void whenDrawSquareThenDrawSquare() {
        new Paint().draw(new Square());
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("++++")
                                .append(System.lineSeparator())
                                .append("+  +")
                                .append(System.lineSeparator())
                                .append("+  +")
                                .append(System.lineSeparator())
                                .append("++++")
                                .append(System.lineSeparator())
                                .toString()
                )
        );
    }
    /**
     * Test paint triangle.
     */
    @Test
    public void whenDrawTriangleThenDrawTriangle() {
        new Paint().draw(new Triangle());
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("  *  ")
                                .append(System.lineSeparator())
                                .append(" *** ")
                                .append(System.lineSeparator())
                                .append("*****")
                                .append(System.lineSeparator())
                                .toString()
                )
        );
    }
}
