package ru.job4j.Student;

import java.util.Comparator;
import java.util.Objects;
/**
 * class Student implements Comparator<Student>.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 28.09.2019
 */
public class Student implements Comparator<Student> {
    /**
     *name.
     */
    private String name;
    /**
     *scope.
     */
    private int scope;

    /**
     * compape.
     * @param o1 object1
     * @param o2 object2
     * @return result
     */
    @Override
    public int compare(Student o1, Student o2) {
        int result;
        if (o1 == null) {
            result = -1;
        } else if (o2 == null) {
            result = 1;
        } else {
            result = Integer.compare(o1.getScope(), o2.getScope());
        }
        return result;
    }

    /**
     * equals.
     * @param o object
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return scope == student.scope &&
                Objects.equals(name, student.name);
    }

    /**
     * hashCode.
     * @return int
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, scope);
    }

    /**
     * constructor.
     * @param name name
     * @param scope scope
     */
    public Student(String name, int scope) {
        this.name = name;
        this.scope = scope;
    }

    /**
     * getter.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * setter.
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter.
     * @return scope
     */
    public int getScope() {
        return scope;
    }

    /**
     * setter.
     * @param scope scope
     */
    public void setScope(int scope) {
        this.scope = scope;
    }
}
