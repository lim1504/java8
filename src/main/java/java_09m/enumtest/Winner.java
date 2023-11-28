package java_09m.enumtest;


import java.util.Arrays;
import java.util.List;

public enum Winner {
    WINNER("승리", Arrays.asList("kyle","pobi","hello","world")),
    LOSER("패배", Arrays.asList("hodol","dunddoung","rutgo"));

    private final String winner;
    private final List<String> list;

    Winner(String winner, List<String> list) {
        this.winner = winner;
        this.list = list;
    }

    public boolean isWinner(String winner) {
        return WINNER.list.contains(winner);
    }
    public int getWinnerSize() {
        return WINNER.list.size();
    }
}
