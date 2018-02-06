package ru.job4j.profession;
/**
 *  класс для Project.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 05.02.2018
 */
public class Project {
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
    public Project(String name) {
        this.name = name;
    }
}