package ru.job4j.strategypattern;
/**
 * class Square.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 25.02.2018
 */
public class Square implements Shape {
    /**
     * drow a square.
     * @return string
     */
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("++++");
        pic.append(System.lineSeparator());
        pic.append("+  +");
        pic.append(System.lineSeparator());
        pic.append("+  +");
        pic.append(System.lineSeparator());
        pic.append("++++");
        return pic.toString();
    }
}
