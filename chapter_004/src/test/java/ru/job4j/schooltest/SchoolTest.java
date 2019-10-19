package ru.job4j.schooltest;

import org.junit.Test;
import ru.job4j.school.School;
import ru.job4j.school.Student;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * class SchoolTest.
 *
 * @author Maxim Borisov (mailto: mixed2004@mail.ru)
 * @version 1
 * @since 14.03.2019
 */
public class SchoolTest {
    /**
     * function whenNeedAClassThenListWhithAScoreStudents().
     */
    @Test
    public void whenNeedAClassThenListWhithAScoreStudents() {
        School school = new School();
        Student student01 = new Student(10);
        Student student02 = new Student(20);
        Student student03 = new Student(30);
        Student student04 = new Student(40);
        Student student05 = new Student(50);
        Student student06 = new Student(60);
        Student student07 = new Student(70);
        Student student08 = new Student(80);
        Student student09 = new Student(90);
        List<Student> students = new ArrayList<>();
        students.add(student01);
        students.add(student02);
        students.add(student03);
        students.add(student04);
        students.add(student05);
        students.add(student06);
        students.add(student07);
        students.add(student08);
        students.add(student09);
        List<Student> result = school.collect(students, student ->student.getScore() >= 70);
        List<Student> expect = new ArrayList<>();
        expect.add(student07);
        expect.add(student08);
        expect.add(student09);
        assertThat(result, is(expect));
    }
    /**
     * function whenNeedBClassThenListWhithBScoreStudents().
     */
    @Test
    public void whenNeedBClassThenListWhithBScoreStudents() {
        School school = new School();
        Student student01 = new Student(10);
        Student student02 = new Student(20);
        Student student03 = new Student(30);
        Student student04 = new Student(40);
        Student student05 = new Student(50);
        Student student06 = new Student(60);
        Student student07 = new Student(70);
        Student student08 = new Student(80);
        Student student09 = new Student(90);
        List<Student> students = new ArrayList<>();
        students.add(student01);
        students.add(student02);
        students.add(student03);
        students.add(student04);
        students.add(student05);
        students.add(student06);
        students.add(student07);
        students.add(student08);
        students.add(student09);
        List<Student> result = school.collect(students, student ->student.getScore() >= 50 && student.getScore() < 70);
        List<Student> expect = new ArrayList<>();
        expect.add(student05);
        expect.add(student06);
        assertThat(result, is(expect));
    }
    /**
     * function whenNeedCClassThenListWhithCScoreStudents().
     */
    @Test
    public void whenNeedCClassThenListWhithCScoreStudents() {
        School school = new School();
        Student student01 = new Student(10);
        Student student02 = new Student(20);
        Student student03 = new Student(30);
        Student student04 = new Student(40);
        Student student05 = new Student(50);
        Student student06 = new Student(60);
        Student student07 = new Student(70);
        Student student08 = new Student(80);
        Student student09 = new Student(90);
        List<Student> students = new ArrayList<>();
        students.add(student01);
        students.add(student02);
        students.add(student03);
        students.add(student04);
        students.add(student05);
        students.add(student06);
        students.add(student07);
        students.add(student08);
        students.add(student09);
        List<Student> result = school.collect(students, student ->student.getScore() < 50);
        List<Student> expect = new ArrayList<>();
        expect.add(student01);
        expect.add(student02);
        expect.add(student03);
        expect.add(student04);
        assertThat(result, is(expect));
    }
}
