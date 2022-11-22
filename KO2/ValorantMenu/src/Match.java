import java.util.ArrayList;
import java.util.Random;

public class Match {
    String mode;
    String gameState;
    int roundsWon;
    int roundsLost;
    int rankedRating;
    String agent;
    String map;

    public Match(String mode, String gameState, int roundsWon, int roundsLost, int rankedRating, String agent, String map) {
        this.mode = mode;
        this.gameState = gameState;
        this.roundsWon = roundsWon;
        this.roundsLost = roundsLost;
        this.rankedRating = rankedRating;
        this.agent = agent;
        this.map = map;
    }

    public static void createMatch(String mode) {
        Random rand = new Random();
        String gameState = null;
        int rankedRating = rand.nextInt(16) + 10;
        int roundsWon = rand.nextInt(14);
        int roundsLost = rand.nextInt(14);
        String agent = Agents.getAgents().get(rand.nextInt(20)).getName();
        String map = "Fracture";

        if (roundsWon - roundsLost > 0) {
            gameState = "WIN";
        } else if (roundsWon - roundsLost < 0) {
            gameState = "LOSS";
        } else {
            gameState = "DRAW";
        }
        Match match = new Match(mode, gameState, roundsWon, roundsLost, rankedRating, agent, map);
        Menu.addMatchToHistory(match);
        System.out.println(mode + " match created.");
    }

    public static void printMatchHistory() {
        ArrayList<Match> matchHistory = Menu.getMatchHistory();
        if (matchHistory == null) {
            System.out.println("Match history not found.");
        } else {
            for (int i = 0; i < matchHistory.size(); i++) {
                if (matchHistory.get(i).getMode().equals("Competitive")) {
                    if (matchHistory.get(i).getGameState().equals("WIN")) {
                        System.out.print("+");
                    } else {
                        System.out.print("-");
                    }
                    System.out.print(matchHistory.get(i).getRankedRating() + "RR");
                } else {
                    System.out.print("    ");
                }
                System.out.println("\t\t" + matchHistory.get(i).getMode() + "\t\tAgent: " + matchHistory.get(i).getAgent() + "\t\t Map:" + matchHistory.get(i).getMap() + "\t\t " + matchHistory.get(i).getGameState());
            }
        }
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getGameState() {
        return gameState;
    }

    public void setGameState(String gameState) {
        this.gameState = gameState;
    }

    public int getRoundsWon() {
        return roundsWon;
    }

    public void setRoundsWon(int roundsWon) {
        this.roundsWon = roundsWon;
    }

    public int getRoundsLost() {
        return roundsLost;
    }

    public void setRoundsLost(int roundsLost) {
        this.roundsLost = roundsLost;
    }

    public int getRankedRating() {
        return rankedRating;
    }

    public void setRankedRating(int rankedRating) {
        this.rankedRating = rankedRating;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }
}
