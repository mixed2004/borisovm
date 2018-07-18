package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;

/**
 * Test StartUITest.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 21.02.2018
 */
public class StartUITest {
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
     * method show menu.
     * @return String menu in string/
     */
    private String showMenu() {
        return new StringBuilder()
                .append("0. Create Item")
                .append(System.lineSeparator())
                .append("1. Show All Item")
                .append(System.lineSeparator())
                .append("2. Edit item")
                .append(System.lineSeparator())
                .append("3. Delete item")
                .append(System.lineSeparator())
                .append("4. Find by id item")
                .append(System.lineSeparator())
                .append("5. Find by name item")
                .append(System.lineSeparator())
                .append("6. EXIT")
                .append(System.lineSeparator())
                .toString();
    }
    /**
     * Test add.
     */
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("test name"));
    }
    /**
     * Test edit.
     */
    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item());
        Input input = new StubInput(new String[]{"2", item.getId(), "test name", "desc", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()).getName(), is("test name"));
    }
    /**
     * Test delete.
     */
    @Test
    public void whenDeleteThenTrackerDeleteValue() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test1", "testDescription1", 123L));
        Input input = new StubInput(new String[]{"3", item.getId(), "6"});
        new StartUI(input, tracker).init();
        assertNull(tracker.findById(item.getId()));
    }
    /**
     * Test showAll.
     */
    @Test
    public void whenShowAllThenTrackerShowAllValues() {
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(new Item("test1", "testDescription1", 123L));
        Input input = new StubInput(new String[]{"1", "6"});
        new StartUI(input, tracker).init();
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append(this.showMenu())
                                .append("1 ")
                                .append("id order : ")
                                .append(item1.getId())
                                .append(" name order : test1 ")
                                .append("description order: testDescription1 ")
                                .append("created order: ")
                                .append(item1.getCreated())
                                .append(System.lineSeparator())
                                .append(this.showMenu())
                                .append("EXIT")
                                .append(System.lineSeparator())
                                .toString()
                )
        );
    }
    /**
     * Test findByNameItem.
     */
    @Test
    public void whenFndByNameItemThenTrackerShowNameValue() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test1", "testDescription1", 123L));
        Input input = new StubInput(new String[]{"5", item.getName(), "6"});
        new StartUI(input, tracker).init();
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append(this.showMenu())
                                .append("id order : ")
                                .append(item.getId())
                                .append(" name order : test1 ")
                                .append("description order: testDescription1 ")
                                .append("created order: ")
                                .append(item.getCreated())
                                .append(System.lineSeparator())
                                .append(this.showMenu())
                                .append("EXIT")
                                .append(System.lineSeparator())
                                .toString()
                )
        );
    }
    /**
     * Test findById.
     */
    @Test
    public void whenFndByIDItemThenTrackerShowIDValue() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test1", "testDescription1", 123L));
        Input input = new StubInput(new String[]{"4", item.getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append(this.showMenu())
                                .append("id order : ")
                                .append(item.getId())
                                .append(" name order : test1 ")
                                .append("description order: testDescription1 ")
                                .append("created order: ")
                                .append(item.getCreated())
                                .append(System.lineSeparator())
                                .append(this.showMenu())
                                .append("EXIT")
                                .append(System.lineSeparator())
                                .toString()
                )
        );
    }
}
