package ru.job4j.list;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * class ConvertListArray2List.
 *
 * @author Maxim Borisov (mailto: mixed2004@mail.ru)
 * @version 1
 * @since 30.07.2018
 */
public class ConvertListArray2List {
    /**
     * method converting list of arrays to one list.
     * @param list list
     * @return resultList
     */
    public List<Integer> convert(List<int[]> list) {
 /*       List<Integer> resultList = new ArrayList<>();
        for (int[] listsArray: list) {
            for (int volume: listsArray) {
                resultList.add(volume);
            }
        }
 */
        List<Integer> resultList = list.stream()
                .flatMapToInt(Arrays::stream)
                .boxed().collect(Collectors.<Integer>toList());

        return resultList;
    }
}
