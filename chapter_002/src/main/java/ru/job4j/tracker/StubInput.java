package ru.job4j.tracker;

/**
 * class StubInput.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 21.02.2018
 */
public class StubInput implements Input {
    /**
     * This field contains a sequence of user responses.
     * The first item is the choice of the action from StartUI
     * name - name of the order
     * desc - description of the order
     * the last item - exit menu.
     */
    private final String[] value;

    /**
     * The field counts the number by calling the ask method.
     */
    private int position;
    /**
     *constructor for StubInput.
     * @param value sequence of user responses
     */
    public StubInput(final String[] value) {
        this.value = value;
    }
    /**
     * input object from programTest.
     */
    @Override
    public String ask(String question) {
        return this.value[this.position++];
    }
}
