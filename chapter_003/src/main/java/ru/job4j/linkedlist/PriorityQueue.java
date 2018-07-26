package ru.job4j.linkedlist;

import java.util.LinkedList;
/**
 * class PriorityQueue.
 *
 * @author Maxim Borisov (mailto: mixed2004@mail.ru)
 * @version 1
 * @since 26.07.2018
 */
public class PriorityQueue {
    /**
     * LinkedList tasks - list of tasks.
     */
    private LinkedList<Task> tasks = new LinkedList<>();
    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставик использовать add(int index, E value)
     * @param task задача
     */
    public void put(Task task) {
        for (int i = 0; i < tasks.size(); ++i) {
            if (task.getPriority() < tasks.get(i).getPriority()) {
                tasks.add(i, task);
                return;
            }
        }
        tasks.add(task);
    }

    /**
     * method return position of task.
     * @return position
     */
    public Task take() {
        return this.tasks.poll();
    }
}
