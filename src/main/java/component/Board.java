package component;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Board {
    private Line[] arrayOfBoard;

    public Line[] getArrayOfBoard() {
        return arrayOfBoard;
    }

    public void setArrayOfBoard(Line[] arrayOfBoard) {
        this.arrayOfBoard = arrayOfBoard;
    }

    public Board(int width, int height) {
        arrayOfBoard = new Line[height];
        for(int i=0; i<arrayOfBoard.length;i++){
            arrayOfBoard[i] = new Line(width);
        }

    }
}
