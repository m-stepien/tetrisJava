package component;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Board {
    private Line[] arrayOfBoard;
    private int height;
    private int width;

    public Line[] getArrayOfBoard() {
        return arrayOfBoard;
    }

    public void setArrayOfBoard(Line[] arrayOfBoard) {
        this.arrayOfBoard = arrayOfBoard;
    }

    public Board(int width, int height) {
        arrayOfBoard = new Line[height];
        for (int i = 0; i < arrayOfBoard.length; i++) {
            arrayOfBoard[i] = new Line(width);
        }
        this.width = width;
        this.height = height;

    }
    //TODO metody do łatwiejszego dostępu do width i heightg
    public void putNewFigureToBoard(Figure newFigure) {
        int leftShiftToCenterFigure = (this.width - newFigure.getPositionArray().length) / 2;
        for (int j = 0; j < newFigure.getPositionArray()[0].length; j++) {
            for (int i = 0; i < newFigure.getPositionArray().length; i++) {
                this.arrayOfBoard[j].setOccupiedPositions(leftShiftToCenterFigure + i, true);
            }
        }
    }
}
