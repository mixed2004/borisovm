package ru.job4j.tracker;
/**
 * interfase Input.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 19.02.2018
 */
public interface Input {
    /**
     * question to the user.
     * @param question question
     * @return ask
     */

    String ask(String question);
    /**
     * question to the user.
     * @param question question
     * @param range menu
     * @return ask
     */
    int ask(String question, int[] range);
}
