package ru.job4j.chess;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.Figure;
import ru.job4j.chess.figures.black.BishopBlack;
import ru.job4j.chess.figures.black.KnightBlack;
import ru.job4j.chess.figures.black.PawnBlack;
import ru.job4j.chess.figures.black.RookBlack;
import ru.job4j.chess.figures.black.KingBlack;
import ru.job4j.chess.figures.black.QeenBlack;
import ru.job4j.chess.figures.white.BishopWhite;
import ru.job4j.chess.figures.white.KingWhite;
import ru.job4j.chess.figures.white.KnightWhite;
import ru.job4j.chess.figures.white.PawnWhite;
import ru.job4j.chess.figures.white.QeenWhite;
import ru.job4j.chess.figures.white.RookWhite;;

/**
 * Class Chess.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 11.06.2018
 */
public class Chess extends Application {
  /**
   * шахматы www.job4j.ru.
   */
  private static final String JOB4J = "шахматы www.job4j.ru";
  /**
   * size.
   */
  private final int size = 8;
  /**
   * logic.
   */
  private final Logic logic = new Logic();

  /**
   * Rectangle buildRectangle.
   * @param x x
   * @param y y
   * @param size size
   * @param white white
   * @return rect
   */
  private Rectangle buildRectangle(int x, int y, int size, boolean white) {
    Rectangle rect = new Rectangle();
    rect.setX(x * size);
    rect.setY(y * size);
    rect.setHeight(size);
    rect.setWidth(size);
    if (white) {
      rect.setFill(Color.WHITE);
    } else {
      rect.setFill(Color.GRAY);
    }
    rect.setStroke(Color.BLACK);
    return rect;
  }

  /**
   * Rectangle buildFigure.
   * @param x x
   * @param y y
   * @param size size
   * @param image image
   * @return rect
   */
  private Rectangle buildFigure(int x, int y, int size, String image) {
    Rectangle rect = new Rectangle();
    rect.setX(x);
    rect.setY(y);
    rect.setHeight(size);
    rect.setWidth(size);
    Image img = new Image(this.getClass().getClassLoader().getResource(image).toString());
    rect.setFill(new ImagePattern(img));
    final Rectangle momento = new Rectangle(x, y);
    rect.setOnDragDetected(
            event -> {
              momento.setX(event.getX());
              momento.setY(event.getY());
            }
    );
    rect.setOnMouseDragged(
            event -> {
              rect.setX(event.getX() - size / 2);
              rect.setY(event.getY() - size / 2);
            }
    );
    rect.setOnMouseReleased(
            event -> {
              if (logic.move(this.findBy(momento.getX(), momento.getY()), this.findBy(event.getX(), event.getY()))) {
                rect.setX(((int) event.getX() / 40) * 40 + 5);
                rect.setY(((int) event.getY() / 40) * 40 + 5);
              } else {
                rect.setX(((int) momento.getX() / 40) * 40 + 5);
                rect.setY(((int) momento.getY() / 40) * 40 + 5);
              }
            }
    );
    return rect;
  }

  /**
   * Group buildGrid.
   * @return panel
   */
  private Group buildGrid() {
    Group panel = new Group();
    for (int y = 0; y != this.size; y++) {
      for (int x = 0; x != this.size; x++) {
        panel.getChildren().add(
                this.buildRectangle(x, y, 40, (x + y) % 2 == 0)
        );
      }
    }
    return panel;
  }

  /**
   * start.
   * @param stage stage
   */
  @Override
  public void start(Stage stage) {
    BorderPane border = new BorderPane();
    HBox control = new HBox();
    control.setPrefHeight(40);
    control.setSpacing(10.0);
    control.setAlignment(Pos.BASELINE_CENTER);
    Button start = new Button("start");
    start.setOnMouseClicked(
            event -> this.refresh(border)
    );
    control.getChildren().addAll(start);
    border.setBottom(control);
    border.setCenter(this.buildGrid());
    stage.setScene(new Scene(border, 400, 400));
    stage.setTitle(JOB4J);
    stage.setResizable(false);
    stage.show();
    this.refresh(border);
  }

  /**
   * refresh.
   * @param border border
   */
  private void refresh(final BorderPane border) {
    Group grid = this.buildGrid();
    this.logic.clean();
    border.setCenter(grid);
    this.buildWhiteTeam(grid);
    this.buildBlackTeam(grid);
  }

  /**
   * buildBlackTeam.
   * @param grid grid
   */
  private void buildBlackTeam(Group grid) {
    this.add(new PawnBlack(Cell.A7), grid);
    this.add(new PawnBlack(Cell.B7), grid);
    this.add(new PawnBlack(Cell.C7), grid);
    this.add(new PawnBlack(Cell.D7), grid);
    this.add(new PawnBlack(Cell.E7), grid);
    this.add(new PawnBlack(Cell.F7), grid);
    this.add(new PawnBlack(Cell.G7), grid);
    this.add(new PawnBlack(Cell.H7), grid);
    this.add(new RookBlack(Cell.A8), grid);
    this.add(new KnightBlack(Cell.B8), grid);
    this.add(new BishopBlack(Cell.C8), grid);
    this.add(new QeenBlack(Cell.D8), grid);
    this.add(new KingBlack(Cell.E8), grid);
    this.add(new BishopBlack(Cell.F8), grid);
    this.add(new KnightBlack(Cell.G8), grid);
    this.add(new RookBlack(Cell.H8), grid);
  }

  /**
   * buildWhiteTeam.
   * @param grid grid
   */
  public void buildWhiteTeam(Group grid) {
    this.add(new PawnWhite(Cell.A2), grid);
    this.add(new PawnWhite(Cell.B2), grid);
    this.add(new PawnWhite(Cell.C2), grid);
    this.add(new PawnWhite(Cell.D2), grid);
    this.add(new PawnWhite(Cell.E2), grid);
    this.add(new PawnWhite(Cell.F2), grid);
    this.add(new PawnWhite(Cell.G2), grid);
    this.add(new PawnWhite(Cell.H2), grid);
    this.add(new RookWhite(Cell.A1), grid);
    this.add(new KnightWhite(Cell.B1), grid);
    this.add(new BishopWhite(Cell.C1), grid);
    this.add(new QeenWhite(Cell.D1), grid);
    this.add(new KingWhite(Cell.E1), grid);
    this.add(new BishopWhite(Cell.F1), grid);
    this.add(new KnightWhite(Cell.G1), grid);
    this.add(new RookWhite(Cell.H1), grid);
  }

  /**
   * add.
   * @param figure figure
   * @param grid grid
   */
  public void add(Figure figure, Group grid) {
    this.logic.add(figure);
    Cell position = figure.position();
    grid.getChildren().add(
            this.buildFigure(
                    position.getX() * 40 + 5,
                    position.getY() * 40 + 5,
                    30,
                    figure.icon()
            )
    );
  }

  /**
   * findBy.
   * @param graphX graphX
   * @param graphY graphY
   * @return rst
   */
  private Cell findBy(double graphX, double graphY) {
    Cell rst = Cell.A1;
    int x = (int) graphX / 40;
    int y = (int) graphY / 40;
    for (Cell cell : Cell.values()) {
      if (cell.getX() == x && cell.getY() == y) {
        rst = cell;
        break;
      }
    }
    return rst;
  }
}