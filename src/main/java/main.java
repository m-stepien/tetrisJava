import component.Board;
import component.Clock;
import component.Figure;
import component.FigureType;
import gui.GuiTerminal;

public class main {
    public static void main(String[] args) {
        Board board = new Board(10,5);
        FigureGenerator figureGenerator = new FigureGenerator();
        Boolean[][] array = figureGenerator.getArrayForFigure(FigureType.J);
        Figure figure = new Figure(array, FigureType.J);
        board.putNewFigureToBoard(figure);
        GuiTerminal gui = new GuiTerminal();
        gui.showBoard(board);
        Clock clock = new Clock();
        System.out.println("hi");


    }
}

