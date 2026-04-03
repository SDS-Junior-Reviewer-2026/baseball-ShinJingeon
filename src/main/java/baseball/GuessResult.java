package baseball;

public class GuessResult {
    public boolean solved;
    public int strikes;
    public int ball;

    public GuessResult(boolean solved, int strikes, int ball) {
        this.solved = solved;
        this.strikes = strikes;
        this.ball = ball;
    }
}
