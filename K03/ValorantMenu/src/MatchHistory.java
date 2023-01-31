import java.util.ArrayList;

public class MatchHistory {
    static ArrayList<Match> matchHistory = new ArrayList<Match>();

    public static ArrayList<Match> getMatchHistory() {
        return matchHistory;
    }

    public void setMatchHistory(ArrayList<Match> matchHistory) {
        MatchHistory.matchHistory = matchHistory;
    }

    public static void addMatchToHistory(Match match) {
        matchHistory.add(match);
    }
}
