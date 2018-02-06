package ru.job4j.profession;
/**
 *  класс для People.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 05.02.2018
 */
public class People {
    /**
     * имя.
     */
    private String name;

    /**
     * метод получения имени.
     * @return name имя
     */
    public String getName() {
        return this.name;
    }

    /**
     * конструктор.
     * @param name имя
     */
    public People(String name) {
        this.name = name;
    }
}