package ru.job4j.school;

import java.util.function.Predicate;
import java.util.List;
import java.util.stream.Collectors;

/**
 * class School.
 *
 * @author Maxim Borisov (mailto: mixed2004@mail.ru)
 * @version 1
 * @since 14.03.2019
 */
public class School {
    /**
     * method collecting students by score.
     * @param students list students
     * @param predict predicate
     * @return list students
     */
    public List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream().filter(predict).collect(Collectors.toList());
    }
}
