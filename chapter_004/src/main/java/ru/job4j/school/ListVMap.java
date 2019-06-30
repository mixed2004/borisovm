package ru.job4j.school;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * class ListVMap.
 */
public class ListVMap {
    /**
     * method convert List to Map.
     * @param students list of students
     * @return map students
     */
    public Map<String, Student> listToMap(List<Student> students) {
return students
        .stream()
        .collect(Collectors.toMap(x -> x.getName(), x -> x, (oldValue, newValue) -> oldValue));
    }
}
