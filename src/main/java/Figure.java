import java.util.ArrayList;

public class Figure {
    ArrayList<Point> positionList = new ArrayList<>();

    public Figure(ArrayList<Point> points) {
        this.positionList = points;
    }

    public Figure(Point... points) {
        for (Point point : points) {
            this.positionList.add(point);
        }
    }

    public void rotate() {

    }

}
