package component;

public class Point {
    private int xPosition;
    private int yPosition;
    private boolean isMovingX;
    private boolean isMovingY;
    private boolean isOccupied;
    public Point(int xPosition, int yPosition, boolean isOccupied, boolean isMovingX) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.isOccupied = isOccupied;
        this.isMovingX = isMovingX;
        this.isMovingY = true;
    }
    public void moveY() {
        this.yPosition += 1;
    }
    public void moveX() {
        this.xPosition += 1;
    }

    public boolean isOccupied() {
        return isOccupied;
    }
}
