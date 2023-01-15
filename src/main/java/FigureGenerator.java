import component.Figure;
import component.FigureType;

import java.util.ArrayList;
import java.util.Random;

public class FigureGenerator {
    private ArrayList<FigureType> figureTypeList;


    public FigureGenerator() {
        this.figureTypeList = (ArrayList<FigureType>) FigureType.getAllType();
    }

    public Figure getFigure(){
        FigureType figureType = this.randomChoiceFigure();
        Boolean[][] arrayForFigure = this.getArrayForFigure(figureType);
        Figure figure = new Figure(arrayForFigure, figureType);
        return figure;
    }

    private FigureType randomChoiceFigure() {
        Random rand = new Random();
        FigureType choosenFigureType = this.figureTypeList.get(rand.nextInt(this.figureTypeList.size()));
        return choosenFigureType;
    }

    private Boolean[][] getArrayForFigure(FigureType type) {
        Boolean array[][] = new Boolean[2][4];

        switch (type) {
            case I: {
                array[0] = new Boolean[]{false, false, false, false};
                array[1] = new Boolean[]{true, true, true, true};

            }
            case J: {
                array[0] = new Boolean[]{true, false, false, false};
                array[1] = new Boolean[]{true, true, true, true};
            }
            case L: {
                array[0] = new Boolean[]{false, false, false, true};
                array[1] = new Boolean[]{true, true, true, true};
            }
            case O: {
                array[0] = new Boolean[]{true, true, false, false};
                array[1] = new Boolean[]{true, true, false, false};
            }
            case T: {
                array[0] = new Boolean[]{true, true, true, false};
                array[1] = new Boolean[]{false, true, false, false};

            }
            case S: {
                array[0] = new Boolean[]{false, true, true, false};
                array[1] = new Boolean[]{true, true, false, false};
            }
            case Z: {
                array[0] = new Boolean[]{true, true, false, false};
                array[1] = new Boolean[]{false, true, true, false};
            }

        }
        return array;

    }
}
