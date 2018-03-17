package ru.job4j.tracker;
/**
 * class MenuOutException.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 17.03.2018
 */
public class MenuOutException extends RuntimeException {
    /**
     * The constructor MenuOutException.
     * @param question string.
     */
    public MenuOutException(String question) {
        super(question);
    }
}
