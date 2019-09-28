package test.java.ru.job4j.StudentTest;
/**
        * class StudentTest.
        *
        * @author Maxim Borisov (mail: mixed2004@mail.ru)
        * @version 1
        * @since 28.09.2019
        */

import org.junit.Test;
import ru.job4j.Student.Student;
import ru.job4j.Student.SortStudent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class StudentTest {
    @Test
    public void whenUnSortStudentThenSortStudentWhithOutNull(){
        SortStudent test = new SortStudent();
        List<Student> students = Arrays.asList(
        new Student("10", 10),
        new Student("20", 20),
        null,
        new Student("40",40),
        new Student("50",50),
        new Student("60",60),
        null,
        new Student("80",80),
        new Student("90", 90)
        );

        List<Student> result = test.levelOf(students, 70);
        List<Student> expect = Arrays.asList(
                new Student("90", 90),
                new Student("80",80)
        );
        assertThat(result, is(expect));
    }
}
