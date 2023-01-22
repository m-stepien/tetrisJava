package component;

public class Figure {
    //TODO usunąć z konstruktora tablice
    //TODO  zamiast tego zmienić figureGenerator na statyczny i uruchamiać go w konstruktorze
    //TODO potrzebna po tym zmiana testów
    private Boolean[][] positionArray;
    private FigureType name;

    public Figure(Boolean[][] figureArray, FigureType name) {
        this.positionArray = figureArray;
        this.name = name;
    }

    public Boolean[][] getPositionArray() {
        return positionArray;
    }

    public void setPositionArray(Boolean[][] positionArray) {
        this.positionArray = positionArray;
    }

    public FigureType getName() {
        return name;
    }

    public void setName(FigureType name) {
        this.name = name;
    }

    public void rotate() {
        Boolean[][] newPosition;
        if(positionArray.length==4){
            newPosition=new Boolean[2][4];
        }
        else{
            newPosition = new Boolean[4][2];
        }
        for(int i=positionArray.length-1; i>=0;i--){
            for(int j=0; j<positionArray[0].length;j++){
                newPosition[j][positionArray.length-1-i] = positionArray[i][j];
            }
        }
        this.positionArray = newPosition;
    }
    public boolean isOccupied(int i, int j){
        return this.positionArray[i][j];
    }

}
