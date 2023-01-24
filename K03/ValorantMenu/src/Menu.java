import java.util.*;

public class Menu {
    ArrayList<Match> matchHistory = new ArrayList<Match>();

    public Menu() {}

    public boolean printMenu() throws InputMismatchException, WrongInputException {
            int usrInput = 0;
            boolean validOption = true;
            do {
                Scanner sc = new Scanner(System.in);
                try {
                    System.out.println("""
                            (1) PLAY
                            (2) CAREER
                            (3) BATTLE PASS
                            (4) COLLECTION
                            (5) AGENTS
                            (6) STORE
                            (0) EXIT""");
                    usrInput = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Input not valid, please try again.");
                    validOption = false;
                }
                } while (!validOption);
                switch (usrInput) {
                    case 1 -> this.showPlayMenu();
                    case 2 -> this.showCareerMenu();
                    case 3 -> this.showBPMenu();
                    case 4 -> this.showCollectionMenu();
                    case 5 -> this.showAgentsMenu();
                    case 6 -> this.showStoreMenu();
                    case 0 -> {
                        return false;
                    }
                }
        return true;
    }

    public void printMatchHistory() {
        ArrayList<Match> matchHistory = this.getMatchHistory();
        if (matchHistory == null || matchHistory.size() == 0) {
            System.out.println("Match history not found.");
        } else {
            for (Match match : matchHistory) {
                if (match.getMode().equals("Competitive")) {
                    if (match.getGameState().equals("WIN")) {
                        System.out.print("+");
                    } else {
                        System.out.print("-");
                    }
                    System.out.print(match.getRankedRating() + "RR");
                } else {
                    System.out.print("----");
                }
                System.out.println("\t\t" + match.getMode() + "\t\tAgent: " + match.getAgent() + "\t\t Map:" + match.getMap() + "\t\t " + match.getGameState());
            }
        }
    }

    public void createMatch(String mode) throws WrongInputException {
        Random rand = new Random();
        String gameState = null;
        int rankedRating = rand.nextInt(16) + 10;
        int roundsWon = rand.nextInt(14);
        int roundsLost = rand.nextInt(14);
        String agent = Agents.getAgents().get(rand.nextInt(20)).getName();

        if (roundsWon - roundsLost > 0) {
            gameState = "WIN";
        } else if (roundsWon - roundsLost < 0) {
            gameState = "LOSS";
        } else {
            gameState = "DRAW";
        }
        this.addMatchToHistory(new Match(mode, gameState, roundsWon, roundsLost, rankedRating, agent, Match.chooseMap()));
        System.out.println(mode + " match created.");
    }

    private void showPlayMenu() throws WrongInputException {
        Scanner sc = new Scanner(System.in);
        boolean backToMenu = true;

            do {
                System.out.println("""
                        (1) Unrated
                        (2) Competitive
                        (3) Spike rush
                        (4) Deathmatch
                        (5) Escalation
                        (6) Custom Game
                        (0) Back to main menu""");
                int usrInput = sc.nextInt();
                switch (usrInput) {
                    case 1 -> this.createMatch("Unrated");
                    case 2 -> this.createMatch("Competitive");
                    case 3 -> this.createMatch("Spike rush");
                    case 4 -> this.createMatch("Deathmatch");
                    case 5 -> this.createMatch("Escalation");
                    case 6 -> this.createMatch("Custom Game");
                    case 0 -> backToMenu = false;
                }
            } while (backToMenu);
    }

    private void showCareerMenu() {
        Scanner sc = new Scanner(System.in);

        this.printMatchHistory();
    }

    private void showBPMenu() {
        System.out.println("No battle pass available");
    }

    private void showCollectionMenu() {
        Scanner sc = new Scanner(System.in);
        boolean backToMenu = true;
        do {
            System.out.println("""
                    (0) Back to game
                    
                    Classic Stinger  Bulldog   Marshal
                    Shorty  Spectre  Guardian  Operator
                    Frenzy  Bucky    Phantom   Ares
                    Ghost   Judge    Vandal    Odin
                    Sheriff                    Knife
                    """);
            if (sc.nextInt() == 0) {
                backToMenu = false;
            }
        } while (backToMenu);
    }

    private void showAgentsMenu() {
        Agents agentsCall = new Agents();
        Scanner sc = new Scanner(System.in);
        int usrInput;
        boolean backToMenu = true;
        do {
        ArrayList<Agents> agents = Agents.getAgents();
        for (int i = 0; i < agents.size(); i++) {
            System.out.println(i + "." + agents.get(i).getName() + " | " + agents.get(i).getRole());
        }
        System.out.println("""
                
                (1 - 20) Select an agent for role description
                (0) Back to game
                """);
        usrInput = sc.nextInt();
            System.out.println(usrInput + ". " + agents.get(usrInput).getName() + ": " + agents.get(usrInput).getRole());
            agents.get(usrInput).getRoleDescription();
            System.out.println("(0) Return to game");
            if (sc.nextInt() == 0) {
                backToMenu = false;
            }
        } while (backToMenu);
    }

    private void showStoreMenu() {
        Scanner sc = new Scanner(System.in);
        boolean backToMenu = true;
        do {
            System.out.println("""
                    (0) Back to game
                    
                    Featured: Oni 2.0
                    Daily:
                    Smite Odin  |  Spline classic  |  Forsaken classic | RGX Spectre
                    """);
            if (sc.nextInt() == 0) {
                backToMenu = false;
            }
        } while (backToMenu);
    }

    public ArrayList<Match> getMatchHistory() {
        return this.matchHistory;
    }

    public void setMatchHistory(ArrayList<Match> matchHistory) {
        this.matchHistory = matchHistory;
    }

    public void addMatchToHistory(Match match) {
        this.matchHistory.add(match);
    }
}
