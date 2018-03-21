package ru.job4j.tracker;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
/**
 * Test ValidateInput.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 21.02.2018
 */
public class ValidateInputTest {
    /**
     *buffer for the result.
     */
    private final ByteArrayOutputStream mem = new ByteArrayOutputStream();
    /**
     *The field contains the default output to the console.
     */
    private final PrintStream out = System.out;
    /**
     * The method of replacing standard output with output to memory for testing.
     */
    @Before
    public void loadMem() {
        System.setOut(new PrintStream(this.mem));
    }
    /**
     * method of returning output to the console.
     */
    @After
    public void loadSys() {
        System.setOut(this.out);
    }

    /**
     * Test ValidateInput.
     */
    @Test
    public void whenInvalidInput() {
        ValidateInput input = new ValidateInput(
                new StubInput(new String[] {"invalid", "1"})
        );
        input.ask("add", new int[] {1});
        assertThat(
                this.mem.toString(),
                is(
                        String.format("enter validate data%n")
                )
        );
    }
}
