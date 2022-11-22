import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    static ArrayList<Match> matchHistory = new ArrayList<Match>();

    private Menu() {}


    public static boolean printMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                (1) PLAY
                (2) CAREER
                (3) BATTLE PASS
                (4) COLLECTION
                (5) AGENTS
                (6) STORE
                (0) EXIT""");
        switch (sc.nextInt()) {
            case 1 -> showPlayMenu();
            case 2 -> showCareerMenu();
            case 3 -> showBPMenu();
            case 4 -> showCollectionMenu();
            case 5 -> showAgentsMenu();
            case 6 -> showStoreMenu();
            case 0 -> {
                return false;
            }
        }
        return true;
    }

    private static void showPlayMenu() {
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
                case 1 -> Match.createMatch("Unrated");
                case 2 -> Match.createMatch("Competitive");
                case 3 -> Match.createMatch("Spike rush");
                case 4 -> Match.createMatch("Deathmatch");
                case 5 -> Match.createMatch("Escalation");
                case 6 -> Match.createMatch("Custom Game");
                case 0 -> backToMenu = false;
            }
        } while (backToMenu);
    }

    private static void showCareerMenu() {
        Scanner sc = new Scanner(System.in);
        boolean backToMenu = true;

        do {
            Match.printMatchHistory();
            if (sc.nextInt() == 0) {
                backToMenu = false;
            }
        } while (backToMenu);
    }

    private static void showBPMenu() {
        System.out.println("No battle pass available");
    }

    private static void showCollectionMenu() {
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

    private static void showAgentsMenu() {
        ArrayList<Agents> agents = Agents.getAgents();
        for (int i = 0; i < agents.size(); i++) {
            System.out.println(i + "." + agents.get(i).getName() + " | " + agents.get(i).getRole());
        }
        System.out.println("");
    }

    private static void showStoreMenu() {
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

    public static ArrayList<Match> getMatchHistory() {
        return matchHistory;
    }

    public void setMatchHistory(ArrayList<Match> matchHistory) {
        Menu.matchHistory = matchHistory;
    }

    public static void addMatchToHistory(Match match) {
        getMatchHistory().add(match);
    }
}
