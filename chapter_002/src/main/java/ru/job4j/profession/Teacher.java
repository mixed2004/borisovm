package ru.job4j.profession;
/**
 * дочерний класс для профессий Profession - Teacher.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 05.02.2018
 */
public class Teacher extends Profession {
    /**
     * предмет.
     */
    private String subject;
    /**
     * квалификация.
     */
    private int qualification;
    /**
     * ведение классного руководства.
     */
    private boolean classroomManagement;
    /**
     * конструктор.
     * @param name имя
     * @param universityDiploma университетскиц диплом
     * @param subject предмет
     * @param qualification квалификация
     * @param classroomManagement классное руководство
     */
    public Teacher(String name, String universityDiploma, String subject, int qualification, boolean classroomManagement) {
        super(name, universityDiploma);
        this.subject = subject;
        this.qualification = qualification;
        this.classroomManagement = classroomManagement;
    }
    /**
     * метод получения предмета.
     * @return subject предмет
     */
    public String getSubject() {
        return this.subject;
    }

    /**
     * метод получения квалификации.
     * @return qualification квалификация
     */
    public int getQualification() {
        return this.qualification;
    }

    /**
     * метод получения наличия классного руководства.
     * @return classroomManagement классное руководство
     */
    public boolean isClassroomManagement() {
        return this.classroomManagement;
    }

    /**
     * метод учитель учит студента.
     * @param student студент объект
     */
    public void teach(Student student) {
        System.out.println("учитель " + this.getName() + " учит " + student.getName());
    }

    /**
     * метод повышения квалификации.
     * @param teacher учитель
     */
    public void raiseQualification(Teacher teacher) {
        teacher.qualification++;
    }
}