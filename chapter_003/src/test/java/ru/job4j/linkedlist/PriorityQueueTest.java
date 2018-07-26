package ru.job4j.linkedlist;

import static org.hamcrest.core.Is.is;
import org.junit.Assert;
import org.junit.Test;

/**
 * class PriorityQueueTest.
 *
 * @author Maxim Borisov (mailto: mixed2004@mail.ru)
 * @version 1
 * @since 26.07.2018
 */
public class PriorityQueueTest {
    /**
     * public void whenHigherPriority.
     */
    @Test
    public void whenHigherPriority() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));
        Task result = queue.take();
        Assert.assertThat(result.getDesc(), is("urgent"));
    }
}
