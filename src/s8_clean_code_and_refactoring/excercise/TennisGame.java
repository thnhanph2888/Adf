package excercise;

public class TennisGame {

    public static String setScoreWhenTie(int score) {
        String scoreResult = "";
        switch (score) {
            case 0:
                scoreResult = "Love-All";
                break;
            case 1:
                scoreResult = "Fifteen-All";
                break;
            case 2:
                scoreResult = "Thirty-All";
                break;
            case 3:
                scoreResult = "Forty-All";
                break;
            default:
                scoreResult = "Deuce";
                break;
        }
        return scoreResult;
    }

    public static String setScoreWhenEnd(int firstScore, int secondScore) {
        String scoreResult = "";
        int minusResult = firstScore - secondScore;
        if (minusResult == 1) scoreResult = "Advantage player1";
        else if (minusResult == -1) scoreResult = "Advantage player2";
        else if (minusResult >= 2) scoreResult = "Win for player1";
        else scoreResult = "Win for player2";
        return scoreResult;
    }

    public static String countRatioNumber(int firstScore, int secondScore){
        String scoreResult = "";
        int tempScore = 0;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = firstScore;
            else {
                scoreResult += "-";
                tempScore = secondScore;
            }
            switch (tempScore) {
                case 0:
                    scoreResult += "Love";
                    break;
                case 1:
                    scoreResult += "Fifteen";
                    break;
                case 2:
                    scoreResult += "Thirty";
                    break;
                case 3:
                    scoreResult += "Forty";
                    break;
            }
        }
        return scoreResult;
    }

    public static String getScore(int firstScore, int secondScore) {
        String score = "";
        boolean isHaveWinner = firstScore >= 4 || secondScore >= 4;
        boolean isEqualPoints = firstScore == secondScore;

        if (isEqualPoints) {
            score = setScoreWhenTie(firstScore);
        } else if (isHaveWinner) {
            score = setScoreWhenEnd(firstScore, secondScore);
        } else {
            score = countRatioNumber(firstScore, secondScore);
        }
        return score;
    }
}