package ru.job4j.school;

import java.util.Objects;

/**
 * class Student.
 */
public class Student {
    /**
     * score.
     */
    private int score;
    /**
     * name.
     */
    private String name;

    /**
     * getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * constructor for Student.
     * @param score score
     * @param name name
     */
    public Student(int score, String name) {
        this.score = score;
        this.name = name;
    }

    /**

     * constructor for Stident.
     * @param score score
     */
    public Student(int score) {
        this.score = score;
    }
    /**
     * @return score.
     */
    public int getScore() {
        return score;
    }
    /**
     * Set store.
     * @param score score
     */
    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return score == student.score
                &&  Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(score, name);
    }
}
