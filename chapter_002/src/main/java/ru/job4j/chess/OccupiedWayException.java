package ru.job4j.chess;
/**
 * class OccupiedWayException.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 13.06.2018
 */
public class OccupiedWayException extends Exception {
  /**
   * The constructor OccupiedWayException.
   * @param question string.
   */
  public OccupiedWayException(String question) {
    super(question);
  }
}