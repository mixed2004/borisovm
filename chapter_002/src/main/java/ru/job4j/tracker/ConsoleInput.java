package ru.job4j.tracker;

import java.util.Scanner;

/**
 * class ConsoleInput.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 19.02.2018
 */
public class ConsoleInput implements Input {
    /**
     * input object from string.
     */
    private Scanner scanner = new Scanner(System.in);
    @Override
    public String ask(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }
}
