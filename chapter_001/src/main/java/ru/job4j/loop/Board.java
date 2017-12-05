package ru.job4j.loop;
/**
 * прорисовка шахматной доски.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 05.12.2017
 */
public class Board {
    /**
     * Method calc факториал числа.
     *
     * @param width  ширина доски
     * @param height высота доски
     * @return screen результат строки
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int iHeight = 0; iHeight < height; iHeight++) {
            for (int jWidth = 0; jWidth < width; jWidth++) {
                // условие проверки, что писать пробел или X
                if ((iHeight + jWidth) % 2 == 0) {
                    screen.append("X");
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
