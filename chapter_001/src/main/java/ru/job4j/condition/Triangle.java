package ru.job4j.condition;
/**
 * программа вычисления площади треугольника по координатам.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 06.10.2017
 */
public class Triangle {
    /**
     * вершина a.
     */
    private Point a;
    /**
     * вершина b.
     */
    private Point b;
    /**
     * вершина c.
     */
    private Point c;
    /**
     * функция присвоения значений вершин.
     *
     * @param a a
     * @param b b
     * @param c c
     */
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    /**
     * Метод вычисляет расстояние между точками left и right.
     *
     * @param left Точка слева
     * @param right Точка с права.
     * @return расстояние между точками left и right.
     */
    public double distance(Point left, Point right) {
        return Math.sqrt(Math.pow((right.getX() - left.getX()), 2) + Math.pow((right.getY() - left.getY()), 2));
    }
    /**
     * Метод вычисления полупериметра по длинам сторон.
     *
     * @param ab расстояние между точками a b
     * @param ac расстояние между точками a c
     * @param bc расстояние между точками b c
     * @return Перимент.
     */
    public double period(double ab, double ac, double bc) {
        return (ab + ac + bc) / 2;
    }
    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     *
     * @param ab Длина от точки a b.
     * @param ac Длина от точки a c.
     * @param bc Длина от точки b c.
     * @return triangleIsReal false, если не существует треугольник.
     */
    private boolean exist(double ab, double ac, double bc) {
        boolean triangleIsReal = true;
        if (ab < 0 || ac < 0 || bc < 0 || (ab + ac < bc) || (ab + bc < ac) || (ac + bc < ab)) {
            triangleIsReal = false;
        }
        return triangleIsReal;
    }
    /**
     * Метод вычисляет прощадь треугольканива.
     *
     * @return Вернуть прощадь, если треугольник существует или -1.
     */
    public double area() {
        double rsl = -1;
        double ab = this.distance(this.a, this.b);
        double ac = this.distance(this.a, this.c);
        double bc = this.distance(this.b, this.c);
        double p = this.period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            rsl = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return rsl;
    }

}
