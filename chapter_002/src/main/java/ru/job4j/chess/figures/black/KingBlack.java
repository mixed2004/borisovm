package ru.job4j.chess.figures.black;

import ru.job4j.chess.ImposibleMoveException;
import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.Figure;

/**
 * class KingBlack implements Figure.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 13.06.2018
 */
public class KingBlack implements Figure {
  /**
   * position of figure.
   */
  private final Cell position;
  /**
   * The constructor KingBlack.
   * @param position position
   */
  public KingBlack(final Cell position) {
    this.position = position;
  }
  /**
   * item retrieval function.
   * @return position.
   */
  @Override
  public Cell position() {
    return this.position;
  }
  /**
   * function of obtaining a path when moving a shape KingBlack.
   * @param source sourse Cell
   * @param dest dest Cell
   * @return array of Cells
   */
  @Override
  public Cell[] way(Cell source, Cell dest) throws ImposibleMoveException {
    Cell[] steps = new Cell[0];
    if (!(Math.abs(dest.getX() - source.getX()) == 1 || Math.abs(dest.getY() - source.getY()) == 1)) {
      throw new ImposibleMoveException("wrong way");
    }
    steps = new Cell[] {dest};

    return steps;
  }
  /**
   * function of copy figure.
   * @param dest dest Cell.
   * @return new figure on destination Cell
   */
  @Override
  public Figure copy(Cell dest) {
    return new KingBlack(dest);
  }
}