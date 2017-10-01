package ru.job4j.calculator;

/**
 * это простейший калькулятор.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 01.10.2017
 */

public class Calculator {
    /**
     * обьявление переменной result.
     */
    private double result;
    /**
     * Method add сложение.
     *
     * @param first первый аргумент
     * @param second второй аргумент
     */
    public void add(double first, double second) {
        this.result = first + second;
    }
    /**
     * Method subtract вычитание.
     *
     * @param first первый аргумент
     * @param second второй аргумент
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }
    /**
     * Method div деление.
     *
     * @param first первый аргумент
     * @param second второй аргумент
     */
    public void div(double first, double second) {
        this.result = first / second;
    }
    /**
     * Method multiple умножение.
     *
     * @param first первый аргумент
     * @param second второй аргумент
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }
    /**
     * Method getResult.
     *
     * @return  result возвращает результат простого калькулятора.
     */

    public double getResult() {
        return this.result;
    }

}