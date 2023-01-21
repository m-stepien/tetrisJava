import component.Figure;
import component.FigureType;

import java.util.List;
import java.util.Random;

public class FigureGenerator {
    private List<FigureType> figureTypeList;


    public FigureGenerator() {
        this.figureTypeList = FigureType.getAllType();
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

    public Boolean[][] getArrayForFigure(FigureType type) {
        Boolean array[][] = new Boolean[2][4];

        switch (type) {
            case I: {
                array[0] = new Boolean[]{false, false, false, false};
                array[1] = new Boolean[]{true, true, true, true};
                break;

            }
            case J: {
                array[0] = new Boolean[]{true, false, false, false};
                array[1] = new Boolean[]{true, true, true, true};
                break;
            }
            case L: {
                array[0] = new Boolean[]{false, false, false, true};
                array[1] = new Boolean[]{true, true, true, true};
                break;
            }
            case O: {
                array[0] = new Boolean[]{false, true, true, false};
                array[1] = new Boolean[]{false, true, true, false};
                break;
            }
            case T: {
                array[0] = new Boolean[]{true, true, true, false};
                array[1] = new Boolean[]{false, true, false, false};
                break;
            }
            case S: {
                array[0] = new Boolean[]{false, true, true, false};
                array[1] = new Boolean[]{true, true, false, false};
                break;
            }
            case Z: {
                array[0] = new Boolean[]{true, true, false, false};
                array[1] = new Boolean[]{false, true, true, false};
                break;
            }

        }
        return array;

    }
}
