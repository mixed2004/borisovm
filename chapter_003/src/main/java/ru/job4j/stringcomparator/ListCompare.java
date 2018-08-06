package ru.job4j.stringcomparator;

import java.util.Comparator;
/**
 * class ListCompare implements Comparator<String>.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 05.08.2018
 */
public class ListCompare implements Comparator<String> {
    /**
     * method compare 2 string by Alfabet.
     * @param left 1 string
     * @param right 2 string
     * @return int result of compareting
     */
    @Override
    public int compare(String left, String right) {
        boolean needCompareChar = false;
        int badIndex = 0;
        int leftStrLength = left.length();
        int rightStrLength = right.length();
        int lessStringLehgth = leftStrLength < rightStrLength ? leftStrLength : rightStrLength;
        for (int i = 0; i < lessStringLehgth; i++) {
            if (left.charAt(i) != right.charAt(i)) {
                badIndex = i;
                needCompareChar = true;
                break;
            }
        }
        return needCompareChar ? Character.compare(left.charAt(badIndex), right.charAt(badIndex)) : leftStrLength - rightStrLength;
    }
}
