package ru.job4j.tracker;
/**
 * class ValidateInput.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 17.03.2018
 */
public class ValidateInput extends ConsoleInput {
    @Override
    public int ask(String question, int[] range) {
        boolean invalidData = true;
        int value = -1;
        do {
            try {
                value = super.ask(question, range);
                invalidData = false;
            } catch (NumberFormatException nfe) {
                System.out.println("enter validate data");
            } catch (MenuOutException moe) {
                System.out.println("enter data from menu");
            }
        } while (invalidData);
        return value;
    }
}
