package ru.job4j.chess;

import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.Figure;

/**
 * class Logic.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 13.06.2018
 */
public class Logic {
  /**
   * array of figures.
   */
  private final Figure[] figures = new Figure[32];
  /**
   * index figure.
   */
  private int index = 0;

  /**
   * function of add figure in array.
   * @param figure figure
   */
  public void add(Figure figure) {
    this.figures[this.index++] = figure;
  }

  /**
   * function of motion of a figure with verification of freedom of way.
   * @param source sourse Cell.
   * @param dest destination Cell.
   * @return rst boolean
   */
  public boolean move(Cell source, Cell dest) {
    boolean rst = false;
    int index = this.findBy(source);
    if (index != -1) {
      Cell[] steps = new Cell[0];
      try {
        steps = this.figures[index].way(source, dest);
      } catch (ImposibleMoveException e) {
        System.out.println("please use the wayrule of the figure");
      }

      if (steps.length > 0) {
        rst = true;
        for (Cell step : steps) {
          for (Figure figure : figures) {
            if (figure.position().equals(step)) {
              rst = false;
            }

          }
        }
      }
    }
    if (rst) {
      this.figures[index] = this.figures[index].copy(dest);
    }

    return rst;
  }

  /**
   * function of clean Cell.
   */
  public void clean() {
    for (int position = 0; position != this.figures.length; position++) {
      this.figures[position] = null;
    }
    this.index = 0;
  }

  /**
   *figure cell search function by coordinates.
   * @param cell cell
   * @return index of figure
   */
  private int findBy(Cell cell) {
    int rst = -1;
    for (int index = 0; index != this.figures.length; index++) {
      if (this.figures[index] != null && this.figures[index].position().equals(cell)) {
        rst = index;
        break;
      }
    }
    return rst;
  }
}