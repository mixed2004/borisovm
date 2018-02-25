package ru.job4j.strategypattern;
/**
 * class Paint.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 25.02.2018
 */
public class Paint {
    /**
     * methot to draw the object.
     * @param shape interface for figure
     */
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }
}
