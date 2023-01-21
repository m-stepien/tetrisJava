import component.Board;

public class main {
    public static void main(String[] args) {
        Board board = new Board(5,5);
        System.out.println(board.getArrayOfBoard()[0].isPositionOccupied(0));

    }
}

