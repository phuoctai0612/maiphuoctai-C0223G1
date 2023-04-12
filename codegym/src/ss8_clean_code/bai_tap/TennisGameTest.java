package ss8_clean_code.bai_tap;

import java.util.Arrays;
import java.util.Collection;

public class TennisGameTest {
    private int player1Score;
    private int player2Score;
    private String expectedScore;

    public TennisGameTest(int player1Score, int player2Score, String expectedScore) {
        this.player1Score = player1Score;
        this.player2Score = player2Score;
        this.expectedScore = expectedScore;
    }


    public int getPlayer1Score() {
        return player1Score;
    }

    public int getPlayer2Score() {
        return player2Score;
    }

    public String getExpectedScore() {
        return expectedScore;
    }

    public static Collection<Object[]> getAllScores() {
        return Arrays.asList(new Object[][]{
                {0, 0, "Love-All"},
                {1, 1, "Fifteen-All"},
                {2, 2, "Thirty-All"},
                {3, 3, "Forty-All"},
                {4, 4, "Deuce"},

                {1, 0, "Fifteen-Love"},
                {0, 1, "Love-Fifteen"},
                {2, 0, "Thirty-Love"},
                {0, 2, "Love-Thirty"},
                {3, 0, "Forty-Love"},
                {0, 3, "Love-Forty"},
                {4, 0, "Win for player1"},
                {0, 4, "Win for player2"},

                {2, 1, "Thirty-Fifteen"},
                {1, 2, "Fifteen-Thirty"},
                {3, 1, "Forty-Fifteen"},
                {1, 3, "Fifteen-Forty"},
                {4, 1, "Win for player1"},
                {1, 4, "Win for player2"},

                {3, 2, "Forty-Thirty"},
                {2, 3, "Thirty-Forty"},
                {4, 2, "Win for player1"},
                {2, 4, "Win for player2"},

                {4, 3, "Advantage player1"},
                {3, 4, "Advantage player2"},
                {5, 4, "Advantage player1"},
                {4, 5, "Advantage player2"},
                {15, 14, "Advantage player1"},
                {14, 15, "Advantage player2"},

                {6, 4, "Win for player1"},
                {4, 6, "Win for player2"},
                {16, 14, "Win for player1"},
                {14, 16, "Win for player2"},
        });
    }

    public void checkAllScores() {
        int highestScore = Math.max(getPlayer1Score(), getPlayer2Score());
        int scoreOfPlayer1 = 0;
        int scoreOfPlayer2 = 0;
        for (int i = 0; i < highestScore; i++) {
            if (i < getPlayer1Score())
                scoreOfPlayer1 += 1;
            if (i < getPlayer2Score())
                scoreOfPlayer2 += 1;
        }
        System.out.println(TennisGame.getScore(scoreOfPlayer1, scoreOfPlayer2));
    }

    @Override
    public String toString() {
        return "TennisGameTest{" +
                "player1Score=" + player1Score +
                ", player2Score=" + player2Score +
                ", expectedScore='" + expectedScore + '\'' +
                '}';
    }
}
