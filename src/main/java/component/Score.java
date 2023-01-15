package component;

public class Score {
    private int userScore;

    public Score() {
        userScore = 0;
    }

    public int getUserScore() {
        return this.userScore;
    }

    private void setUserScore(int score) {
        this.userScore = score;
    }

    public void addToScore(int additionalPoint) {
        this.userScore += additionalPoint;
    }
}
