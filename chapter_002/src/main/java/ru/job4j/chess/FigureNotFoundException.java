package ru.job4j.chess;
/**
 * class FigureNotFoundException.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 13.06.2018
 */
public class FigureNotFoundException extends Exception {
  /**
   * The constructor FigureNotFoundException.
   * @param question string.
   */
  public FigureNotFoundException(String question) {
    super(question);
  }
}