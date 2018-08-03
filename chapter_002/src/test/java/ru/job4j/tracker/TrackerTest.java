package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 17.02.2018
 */
public class TrackerTest {
    /**
     * Test add.
     */
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        List<Item> resultArray = new ArrayList<>();
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        resultArray.add(item);
        assertThat(tracker.findAll(), is(resultArray));
    }
    /**
     * Test findAll.
     */
    @Test
    public void whenFindAllThenTrackerFindAllItem() {
        Tracker tracker = new Tracker();
        List<Item> resultArray = new ArrayList<>();
        Item item1 = new Item("test1", "testDescription1", 123L);
        Item item2 = new Item();
        Item item3 = new Item("test3", "testDescription2", 123L);
        tracker.add(item1);
        tracker.add(item2);
        tracker.delete(item2.getId());
        tracker.add(item3);
        resultArray.add(item1);
        resultArray.add(item3);
        assertThat(tracker.findAll(), is(resultArray));
    }
    /**
     * Test findByName.
     */
    @Test
    public void whenFindBynameThenTrackerFindAllFindNameItem() {
        Tracker tracker = new Tracker();
        List<Item> resultArray = new ArrayList<>();
        Item item1 = new Item("test1", "testDescription1", 123L);
        Item item2 = new Item("test1", "testDescription2", 123L);
        Item item3 = new Item("test3", "testDescription3", 123L);
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        resultArray.add(item1);
        resultArray.add(item2);
        assertThat(tracker.findByName("test1"), is(resultArray));
    }
    /**
     * Test replace.
     */
    @Test
    public void whenReplaceByIdThenTrackerFindIdAndReplaseItem() {
        Item item = new Item();
        Tracker tracker = new Tracker();
        List<Item> resultArray = new ArrayList<>();
        Item item1 = new Item("test1", "testDescription1", 123L);
        Item item2 = new Item("test2", "testDescription2", 123L);
        Item item3 = new Item("test3", "testDescription3", 123L);
        Item item4 = new Item("test4", "testDescription4", 123L);
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.replace(item2.getId(), item4);
        resultArray.add(item1);
        resultArray.add(item4);
        resultArray.add(item3);
        assertThat(tracker.findAll(), is(resultArray));
    }
    /**
     * Test delete.
     */
    @Test
    public void deleteByIdThenTrackerFindIdAndDeleteItem() {
        Tracker tracker = new Tracker();
        ArrayList<Item> resultArray = new ArrayList<>();
        Item item1 = new Item("test1", "testDescription1", 123L);
        Item item2 = new Item("test2", "testDescription2", 123L);
        Item item3 = new Item("test3", "testDescription3", 123L);
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.delete(item2.getId());
        resultArray.add(item1);
        resultArray.add(item3);
        assertThat(tracker.findAll(), is(resultArray));
    }
}