package component;

public class Board {
    private Point[][] arrayOfBoard;
    private int height;
    private int width;
    private int[][] movingFigurePoint;
    private Figure newFigure;

    public Point[][] getArrayOfBoard() {
        return arrayOfBoard;
    }


    public Board(int width, int height) {
        arrayOfBoard = new Point[height][width];
        this.width = width;
        this.height = height;
        for(int i =0; i<height;i++){
            for(int j=0; j<width;j++){
                arrayOfBoard[i][j] = new Point(i,j,false,false);
            }
        }

    }
    public void emptyLine(int i){
        for(int j=0; j<this.width;j++){
            this.arrayOfBoard[i][j].setOccupied(false);
        }
    }

    public boolean isLineFull(int idx){
        boolean full = true;
        for(int i=0;i<this.width; i++){
            if(!this.arrayOfBoard[idx][i].isOccupied()){
                full = false;
                break;
            }
        }
        return full;
    }
    //TODO metody do łatwiejszego dostępu do width i heightg
    public void putNewFigureToBoard(Figure newFigure) {
        int leftShiftToCenterFigure = (this.width - newFigure.getPositionArray()[0].length) / 2;
        for (int j = 0; j < newFigure.getWidth(); j++) {
            for (int i = 0; i < newFigure.getHeight(); i++) {
                this.arrayOfBoard[i][j+leftShiftToCenterFigure] = new Point(i, j+leftShiftToCenterFigure, true, true);
            }
        }
    }
    public void moveAbovePointDown(int idx){
        for(int i=idx-1; i>=0;i--){
            changeLine(i, i+1);
        }
    }
    public void changeLine(int idxToMove, int idxDestination){
        for(int i = 0; i<width; i++){
            this.arrayOfBoard[idxDestination][i].setOccupied(true);
            this.arrayOfBoard[idxToMove][i].setOccupied(false);
        }
    }
    }

