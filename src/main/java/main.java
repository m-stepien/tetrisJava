import component.Board;
import component.Figure;
import component.FigureType;

public class main {
    public static void main(String[] args) {
        Board board = new Board(5,5);
        System.out.println(board.getArrayOfBoard()[0].isPositionOccupied(0));
        FigureGenerator figureGenerator = new FigureGenerator();
        Boolean[][] array = figureGenerator.getArrayForFigure(FigureType.I);
        Figure figure = new Figure(array, FigureType.I);
        board.putNewFigureToBoard(figure);

    }
}

