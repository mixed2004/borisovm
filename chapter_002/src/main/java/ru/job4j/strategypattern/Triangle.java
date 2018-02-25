package ru.job4j.strategypattern;
/**
 * class Triangle.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 25.02.2018
 */
public class Triangle implements Shape {
    /**
     * drow a triangle.
     * @return string
     */
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("  *  ");
        pic.append(System.lineSeparator());
        pic.append(" *** ");
        pic.append(System.lineSeparator());
        pic.append("*****");
        return pic.toString();
    }
}
