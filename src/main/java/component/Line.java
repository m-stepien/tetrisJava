package component;

public class Line {
    private Boolean[] occupiedPositions;

    public Line(int width) {
        this.occupiedPositions = new Boolean[width];
        for(int i=0;i<this.occupiedPositions.length;i++){
            this.occupiedPositions[i] = false;
        }
    }

    public Boolean isPositionOccupied(int i) {
        return occupiedPositions[i];

    }

    public void setOccupiedPositions(Boolean[] occupiedPositions) {
        this.occupiedPositions = occupiedPositions;
    }
}
