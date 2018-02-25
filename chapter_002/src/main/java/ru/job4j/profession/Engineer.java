package ru.job4j.profession;
/**
 * дочерний класс для профессий Profession - Engineer.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 05.02.2018
 */
public class Engineer extends Profession {
    /**
     * специальность.
     */
    private String specialty;
    /**
     * категория.
     */
    private int category;
    /**
     * конструктор.
     *@param name имя
     *@param universityDiploma диплом университета
     *@param specialty специальность
     *@param category категория
     */
    public Engineer(String name, String universityDiploma, String specialty, int category) {
        super(name, universityDiploma);
        this.specialty = specialty;
        this.category = category;
    }
    /**
     * метод получения специальности.
     * @return specialty специальность
     */
    public String getSpecialty() {
        return this.specialty;
    }

    /**
     * метод получения категории.
     * @return category категория
     */
    public int getCategory() {
        return this.category;
    }
    /**
     * метод инженер разрабатывает проект.
     * @param project проект объект
     */
    public void developProject(Project project) {
        System.out.println("инженер " + this.getName() + " разрабатывает " + project.getName());
    }

}