package packagename;
import java.util.ArrayList;

public class LeaderBoard {
    private int cap;
    private ArrayList<Score> scoreboard;

    public LeaderBoard(int c) {
        cap = c;
        scoreboard = new ArrayList<>(c);
    }

    public void addScore(String name, int score) {
        Score newScore = new Score(name, score);

  
        int i = 0;
        while (i < scoreboard.size() && score <= scoreboard.get(i).getScore()) {
            i++;
        }

        scoreboard.add(i, newScore);

        if (scoreboard.size() > cap) {
            scoreboard.remove(scoreboard.size() - 1);
        }
    }

    public int getHighScore() {
        if (scoreboard.isEmpty()) {
        	return 0;
        }
        return scoreboard.get(0).getScore();
    }

    public int getAverageScore() {
        if (scoreboard.isEmpty()) {
        	return 0;
        }

        int total = 0;
        for (Score s : scoreboard) {
            total += s.getScore();
        }
        return total / scoreboard.size();
    }

    public boolean break1000() {
        for (Score s : scoreboard) {
            if (s.getScore() > 1000) {
            	return true;
            }
        }
        return false;
    }

    public void printLeaderboard() {
        for (Score s : scoreboard) {
            System.out.println(s);
        }
    }
}
