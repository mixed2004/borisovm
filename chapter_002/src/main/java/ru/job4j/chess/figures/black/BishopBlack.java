package ru.job4j.chess.figures.black;

import ru.job4j.chess.ImposibleMoveException;
import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.Figure;


/**
 * class BishopBlack implements Figure.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 13.06.2018
 */
public class BishopBlack implements Figure {
  /**
   * position of figure.
   */
  private final Cell position;
  /**
   * The constructor BishopBlack.
   * @param position position
   */
  public BishopBlack(final Cell position) {
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
   * function of obtaining a path when moving a shape BishopBlack.
   * @param source sourse Cell
   * @param dest dest Cell
   * @return array of Cells
   */
  @Override
  public Cell[] way(Cell source, Cell dest) throws ImposibleMoveException {
    Cell[] steps = new Cell[0];
    if (!(Math.abs(dest.getX() - source.getX()) == Math.abs(dest.getY() - source.getY()))) {
      throw new ImposibleMoveException("wrong way");
    }
    int lengthArrayCells = Math.abs(dest.getX() - source.getX());
    int stepX = 1, stepY = 1;
    if (dest.getX() - source.getX() < 0) {
      stepX = -1;
    }
    if (dest.getY() - source.getY() < 0) {
      stepY = -1;
    }
    steps = new Cell[lengthArrayCells];

    for (int i = 1; i <= lengthArrayCells; i++) {
      steps[i - 1] = Cell.findByCoordinate(source.getX() + stepX * i, source.getY() + stepY * i);
    }


    return steps;

  }
  /**
   * function of copy figure.
   * @param dest dest Cell.
   * @return new figure on destination Cell
   */
  @Override
  public Figure copy(Cell dest) {
    return new BishopBlack(dest);
  }
}