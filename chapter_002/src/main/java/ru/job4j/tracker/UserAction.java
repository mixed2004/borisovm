package ru.job4j.tracker;
/**
 * interfase UserAction.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 12.03.2018
 */
public interface UserAction {
    /**
     * the key of selection user.
     * @return int  the point of menu
     */
    int key();

    /**
     *execution of the selected action.
     * @param input initial parameters
     * @param tracker repository of orders
     */
    void execute(Input input, Tracker tracker);

    /**
     * info of the selected action.
     * @return string
     */
    String info();
}
