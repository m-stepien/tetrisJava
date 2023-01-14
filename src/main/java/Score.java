public class Score {
    private int userScore;

    public Score() {
        userScore = 0;
    }

    public int getUserScore() {
        return this.userScore;
    }

    public void setUserScore(int score) {
        this.userScore = score;
    }

    public void addToScore(int additionalPoint) {
        this.userScore += additionalPoint;
    }
}
