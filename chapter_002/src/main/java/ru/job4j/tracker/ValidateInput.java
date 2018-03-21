package ru.job4j.tracker;
/**
 * class ValidateInput.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 17.03.2018
 */
public class ValidateInput implements Input {
    /**
     * Input.
     */
    private final Input input;
    /**
     *constructor for ValidateInput.
     * @param input input
     */
    public ValidateInput(final Input input) {
        this.input = input;
    }

    @Override
    public String ask(String question) {
        return this.input.ask(question);
    }
    @Override
    public int ask(String question, int[] range) {
        boolean invalidData = true;
        int value = -1;
        do {
            try {
                value = this.input.ask(question, range);
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
