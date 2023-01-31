public interface MatchInterface {
    public String getMode();

    public void setMode(String mode);

    public String getGameState();

    public void setGameState(String gameState);

    public int getRoundsWon();

    public void setRoundsWon(int roundsWon);

    public int getRoundsLost();

    public void setRoundsLost(int roundsLost);

    public int getRankedRating();

    public void setRankedRating(int rankedRating);

    public String getAgent();

    public void setAgent(String agent);

    public String getMap();
    public void setMap(String map);
}
