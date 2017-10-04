package ru.job4j.condition;

/**
 * программа проверки положения точки на графике.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 04.10.2017
 */

public class Point {
    /**
     * координата точки х.
     */
    private int x;
    /**
     * координата точки y.
     */
    private int y;
    /**
     * функция присвоения значений x и y.
     *
     * @param x x
     * @param y y
     */
    public  Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    /**
     * функция получения значения x.
     *
     * @return  x
     */
    public int getX() {
        return this.x;
    }
    /**
     * функция получения значения y.
     *
     * @return  y
     */
    public int getY() {
        return this.y;
    }
    /**
     * функция проверки положения точки на функции y(x)=a*x+b.
     *
     * @param a a
     * @param b b
     * @return boolean
     */
    public boolean is(int a, int b) {
        return y == (a * x + b);
    }
}
