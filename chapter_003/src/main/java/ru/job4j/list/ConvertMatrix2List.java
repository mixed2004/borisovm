package ru.job4j.list;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * class ConvertMatrix2List.
 *
 * @author Maxim Borisov (mailto: mixed2004@mail.ru)
 * @version 1
 * @since 26.07.2018
 */
public class ConvertMatrix2List {

    /**
     * method convert matrix to list.
     * @param array array
     * @return list
     */
    public List<Integer> toList(int[][] array) {
   /*    List<Integer> list = new ArrayList<>();
        for (int[] arrayVolumeI: array) {
            for (int arrayVolumeJ: arrayVolumeI) {
                list.add(arrayVolumeJ);
            }
        }
        return list;
   */
        List<Integer> list = Arrays.stream(array)
                .flatMapToInt(Arrays::stream)
                .boxed()
                .collect(Collectors.toList());
        return list;
    }
}
