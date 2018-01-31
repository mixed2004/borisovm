package ru.job4j.array;
/**
 * слияние двух отсортированных массивов в один с учетом общей сортировки.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 31.01.2018
 */
public class MergerArrays {
    /**
     * Method mergerArraysSort слияние двух отсортированных массивов.
     *
     *@param firstArray первый исходный отсортированный массив
     *@param secondArray второй исходный отсортированный массив
     *@return mergerArray результирующий массив слияния двух исходных массивов.
     */
    public int[] mergerArraysSort(int[] firstArray, int[] secondArray) {
        // зададим переменные обозначающие конец первого и второго массива.
        int endFirstArray = firstArray.length;
        int endSecondArray = secondArray.length;
        int[] mergerArray = new int[endFirstArray + endSecondArray];
        // зададим вспомогательные переменные для нахождения крайних индексов массивов.
        int firstArrayIndex = 0, secondArrayIndex = 0, thirdArrayIndex = 0;
        //выполняем цикл по сравнению элементов первого и второго массива пока не достигнем конца одного из массивов
        while (firstArrayIndex < endFirstArray && secondArrayIndex < endSecondArray) {
            //если элемент первого массива меньше элемента второго то в третий массив помещаем наименьшее значение
            mergerArray[thirdArrayIndex++] = firstArray[firstArrayIndex] < secondArray[secondArrayIndex] ? firstArray[firstArrayIndex++] : secondArray[secondArrayIndex++];
        }
        System.arraycopy(firstArray, firstArrayIndex, mergerArray, thirdArrayIndex, (endFirstArray - firstArrayIndex));
        System.arraycopy(secondArray, secondArrayIndex, mergerArray, thirdArrayIndex, (endSecondArray - secondArrayIndex));
        return mergerArray;
    }
}
