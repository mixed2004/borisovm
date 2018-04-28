package ru.job4j.coffemachine;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test CoffeMachine.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 28.04.2018
 */
public class CoffeMachineTest {
    /**
     * Test changes.
     */
    @Test
    public void when50and35ThenTurnedArrayWhith5and10() {
        CoffeMachine coffeMachine = new CoffeMachine();
        int[] result = {5, 10};
        int[] assertArray = coffeMachine.changes(50, 35);
        assertThat(assertArray, is(result));
    }
    /**
     * Test changes.
     */
    @Test
    public void when50and37ThenTurnedArrayWhith1and2and10() {
        CoffeMachine coffeMachine = new CoffeMachine();
        int[] result = {1, 2, 10};
        int[] assertArray = coffeMachine.changes(50, 37);
        assertThat(result, is(assertArray));
    }
    /**
     * Test changes.
     */
    @Test
    public void when50and50ThenTurnedEmptyArray() {
        CoffeMachine coffeMachine = new CoffeMachine();
        int[] result = {};
        int[] assertArray = coffeMachine.changes(50, 50);
        assertThat(result, is(assertArray));
    }
}
