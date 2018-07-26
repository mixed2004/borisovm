package ru.job4j.linkedlist;
/**
 * class Task.
 *
 * @author Maxim Borisov (mailto: mixed2004@mail.ru)
 * @version 1
 * @since 26.07.2018
 */
public class Task {
    /**
     * parametr desc.
     */
    private String desc;
    /**
     * parametr priority.
     */
    private int priority;
    /**
     * constractor for Task.
     * @param desc desc
     * @param priority priority
     */
    public Task(String desc, int priority) {
        this.desc = desc;
        this.priority = priority;
    }
    /**
     * public method getDesc() get desc.
     * @return desc
     */
    public String getDesc() {
        return desc;
    }
    /**
     * public method getPriority() get priority.
     * @return priority
     */
    public int getPriority() {
        return priority;
    }
}
