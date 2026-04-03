package baseball;

public class GuessResult {
    private boolean solved;
    private int strikes;
    private int ball;

    public GuessResult(boolean solved, int strikes, int ball) {
        this.solved = solved;
        this.strikes = strikes;
        this.ball = ball;
    }

    public boolean isSolved() {
        return solved;
    }

    public int getStrikes() {
        return strikes;
    }

    public int getBall() {
        return ball;
    }
}
