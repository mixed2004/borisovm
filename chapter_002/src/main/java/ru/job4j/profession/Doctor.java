package ru.job4j.profession;
    /**
     * дочерний класс для профессий Profession - Doctor.
     *
     * @author Maxim Borisov (mail: mixed2004@mail.ru)
     * @version 1
     * @since 05.02.2018
     */
public class Doctor extends Profession {
    /**
     * диплом интренатуры.
     */
    private String internshipDiploma;
    /**
     * специальность.
     */
    private String specialty;
    /**
     * наличие ученой степени.
     */
    private boolean scienseDegree;

        /**
         * конструктор.
         * @param name имя
         * @param universityDiploma диплом университета
         * @param internshipDiploma диплом интернатуры
         * @param specialty специальность
         * @param scienseDegree научная степен
         */
    public Doctor(String name, String universityDiploma, String internshipDiploma, String specialty, boolean scienseDegree) {
        super(name, universityDiploma);
          this.internshipDiploma = internshipDiploma;
          this.specialty = specialty;
          this.scienseDegree = scienseDegree;
        }

    /**
     * метод получения сосояния наличия ученой степени.
     * @return scienseDegree научная степень
     */
    public boolean isScienseDegree() {
        return this.scienseDegree;
    }

    /**
     * метод получения диплома интернатуры.
     * @return internshipDiploma диплом интернатуры
     */
    public String getInternshipDiploma() {
        return this.internshipDiploma;
    }

    /**
     * метод получения специальности.
     * @return specialty специальность
     */
    public String getSpecialty() {
        return this.specialty;
    }
        /**
         * метод доктор лечит человека.
         * @param people человек объект
         */
        public void healPeople(People people) {
            System.out.println("доктор " + this.name + " лечит " + people.getName());
        }

    }