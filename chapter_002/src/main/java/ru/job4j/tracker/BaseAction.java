package ru.job4j.tracker;
/**
 * abstract class BaseAction.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 29.03.2018
 */
public abstract class BaseAction implements UserAction {
    /**
     * the key of selection user.
     */
    private final int key;
    /**
     * info of the selected action.
     */
    private final String name;

    /**
     *constructor for BaseAction.
     * @param key key
     * @param name name
     */
    protected BaseAction(final int key, final String name) {
        this.key = key;
        this.name = name;
    }
    /**
     * the key of selection user.
     * @return int  the point of menu
     */
    @Override
    public int key() {
        return this.key;
    }
    /**
     * info of the selected action.
     * @return string
     */
    @Override
    public String info() {
        return String.format("%s. %s", this.key, this.name);
    }
}

