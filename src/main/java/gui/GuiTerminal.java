package gui;

import component.Board;

public class GuiTerminal implements Gui{
    public void showBoard(Board board){
        for(int i=0; i < board.getArrayOfBoard().length; i++){
            for(int j=0; j<board.getArrayOfBoard()[0].length; j++){
                if(board.getArrayOfBoard()[i][j].isOccupied()){
                    System.out.print("*");
                }
                else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }

    }


}
