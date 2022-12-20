import java.util.Scanner;

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

    public Match() {

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

    public static String chooseMap() throws WrongInputException {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
               Choose map:
               (1) Ascent
               (2) Bind
               (3) Breeze
               (4) Fracture
               (5) Haven
               (6) Icebox
               (7) Pearl
               (8) Split""");
        switch (sc.nextLine()) {
            case "1" -> {
                return "Ascent";
            }
            case "2" -> {
                return "Bind";
            }
            case "3" -> {
                return "Breeze";
            }
            case "4" -> {
                return "Fracture";
            }
            case "5" -> {
                return "Haven";
            }
            case "6" -> {
                return "Icebox";
            }
            case "7" -> {
                return "Pearl";
            }
            case "8" -> {
                return "Split";
            }
        }
        throw new WrongInputException("Wrong input error occurred.");
    }
}
