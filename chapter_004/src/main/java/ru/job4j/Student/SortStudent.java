package ru.job4j.student;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * class SortStudent.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 28.09.2019
 */
public class SortStudent {
    /**
     * method sort students whithout null.
     *
     * @param students student
     * @param bound    scope.
     * @return list of students
     */
    public List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .sorted(comparator)
                .flatMap(Stream::ofNullable)
                .takeWhile(obj -> obj.getScope() > bound)
                .collect(Collectors.toList());
    }

    /**
     * comparator for Student.
     */
    private Comparator<Student> comparator = (o1, o2) -> {
        if (o1 == null) {
            return 1;
        }
        if (o2 == null) {
            return -1;
        }
        return Integer.compare(o2.getScope(), o1.getScope());
    };

}
