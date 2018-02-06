package ru.job4j.profession;
/**
 * родительский класс для профессий Profession.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 05.02.2018
 */
public class Profession {
    /**
     * имя.
     */
    private String name;
    /**
     * диплом университета.
     */
    private String universityDiploma;

    /**
     * конструктор.
     * @param name имя
     * @param universityDiploma университетский диплом
     */
    public Profession(String name, String universityDiploma) {
        this.name = name;
        this.universityDiploma = universityDiploma;
    }

    /**
     * конструктор по умолчанию.
     */
    public Profession() {

    }

    /**
     * метод получения имени.
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * метод получения университетского диплома.
     * @return universityDiploma
     */
    public String getUniversityDiploma() {
        return this.universityDiploma;
    }
}