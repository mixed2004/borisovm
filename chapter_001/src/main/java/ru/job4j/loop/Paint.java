package ru.job4j.loop;
/**
 * прорисовка пирамиды.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 06.12.2017
 */
public class Paint {
    /**
     * Method calc факториал числа.
     *
     * @param h  высота пирамиды
     * @return screen результат строки
     */
    public String piramid(int h) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        // вводим переменную ширины пирамиды
        int piramidWidth = h * 2 - 1;
        for (int iHeight = 0; iHeight < h; iHeight++) {
            for (int jWidth = 0; jWidth < piramidWidth; jWidth++) {
                // условие проверки, что писать пробел или ^
                if (jWidth >= piramidWidth / 2 - iHeight && jWidth <= piramidWidth /  2 + iHeight) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод на новую строку.
            screen.append(ln);
        }
        return screen.toString();
    }
}
