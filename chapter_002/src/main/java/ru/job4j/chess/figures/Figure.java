package ru.job4j.chess.figures;

import ru.job4j.chess.ImposibleMoveException;

/**
 * interface Figure.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 13.06.2018
 */
public interface Figure {
  /**
   * parametr position.
   * @return position
   */
  Cell position();

  /**
   * way.
   * @param source sourse Cell.
   * @param dest dest Cell
   * @return array of Cells
   * @throws ImposibleMoveException ImposibleMoveException
   */
  Cell[] way(Cell source, Cell dest) throws ImposibleMoveException;

  /**
   * icon.
   * @return icon
   */
  default String icon() {
    return String.format(
            "%s.png", this.getClass().getSimpleName()
    );

  }

  /**
   * copy.
   * @param dest destination Cell
   * @return new figure.
   */
  Figure copy(Cell dest);

}