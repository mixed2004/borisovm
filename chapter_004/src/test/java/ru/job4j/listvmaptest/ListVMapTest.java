package ru.job4j.listvmaptest;

import org.junit.Test;
import ru.job4j.school.ListVMap;
import ru.job4j.school.Student;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test class for ListVMap.
 *
 * @author Maxim Borisov (mailto: mixed2004@mail.ru)
 * @version 1
 * @since 30.06.2019
 */
public class ListVMapTest {
    /**
     * function whenNeedAClassThenListWhithAScoreStudents().
     */
    @Test
    public void whenNeedAClassThenListWhithAScoreStudents() {
        ListVMap listVMap = new ListVMap();
        Student student01 = new Student(10, "Ivan");
        Student student02 = new Student(20, "Max");
        Student student03 = new Student(30, "Alex");
        Student student04 = new Student(40, "Oleg");
        Student student05 = new Student(50, "Roman");
        Student student06 = new Student(60, "Ivan");
        List<Student> students = new ArrayList<>();
        students.add(student01);
        students.add(student02);
        students.add(student03);
        students.add(student04);
        students.add(student05);
        students.add(student06);
        Map<String, Student> result = listVMap.listToMap(students);
        Map<String, Student> expect = new LinkedHashMap<>();
        expect.put("Ivan", student01);
        expect.put("Max", student02);
        expect.put("Alex", student03);
        expect.put("Oleg", student04);
        expect.put("Roman", student05);
        assertThat(result, is(expect));
    }
}
