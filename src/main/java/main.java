import component.Figure;
import component.FigureType;

public class main {
    public static void main(String[] args) {
        FigureGenerator fGenerator = new FigureGenerator();
        Figure figure = fGenerator.getFigure();
        System.out.println(figure.getName());
        Boolean[][] faa = figure.getPositionArray();
        for(Boolean[] fa : faa){
            for(Boolean f : fa){
                System.out.print(f);
            }
            System.out.println();
        }
        figure.rotate();
        System.out.println("________________________");
        Boolean[][] faa2 = figure.getPositionArray();
        for(Boolean[] fa : faa2){
            for(Boolean f : fa){
                System.out.print(f);
            }
            System.out.println();
        }

    }
}

