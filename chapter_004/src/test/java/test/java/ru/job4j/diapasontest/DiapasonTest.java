package test.java.ru.job4j.diapasontest;


import org.junit.Test;
import ru.job4j.functionindiapazone.Diapason;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * class DiapasonTest.
 *
 * @author Maxim Borisov (mailto: mixed2004@mail.ru)
 * @version 1
 * @since 17.01.2019
 */
public class DiapasonTest {
    /**
     * function whenLineFunctionThenDiapasonLineFunction().
     */
    @Test
    public void whenLineFunctionThenDiapasonLineFunction() {
        Diapason diapason = new Diapason();
        List<Double> result = diapason.diapason(1, 3, x -> 2 * x + 1);
        assertThat(result, is(Arrays.asList(3D, 5D, 7D)));
    }

    /**
     * function whenQuadraticFunctionThenDiapasonQuadraticFunction().
     */
    @Test
    public void whenQuadraticFunctionThenDiapasonQuadraticFunction() {
        Diapason diapason = new Diapason();
        List<Double> result = diapason.diapason(1, 3, x -> Math.pow(x, 2) + 2);
        assertThat(result, is(Arrays.asList(3D, 6D, 11D)));
    }
    /**
     * function whenLogFunctionThenDiapasonLogFunction().
     */
    @Test
    public void whenLogFunctionThenDiapasonLogFunction() {
        Diapason diapason = new Diapason();
        List<Double> result = diapason.diapason(1, 3, x -> Double.valueOf(Math.round(Math.exp(x))));
        assertThat(result, is(Arrays.asList(3D, 7D, 20D)));
    }
}
