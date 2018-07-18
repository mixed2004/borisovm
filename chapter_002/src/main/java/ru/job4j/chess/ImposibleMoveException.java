package ru.job4j.chess;
/**
 * class ImposibleMoveException.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 13.06.2018
 */
public class ImposibleMoveException extends Exception {
  /**
   * The constructor ImposibleMoveException.
   * @param question string.
   */
  public ImposibleMoveException(String question) {
    super(question);
  }
}