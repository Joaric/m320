import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean exit = true;
        do {
            exit = showMenu();
        } while (exit);
    }

    public static boolean showMenu() {
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
                case 1 -> System.out.println("Connection Error.\n");
                case 2 -> System.out.println("Error LV-03\nLevel requirement not reached.\n");
                case 3 -> System.out.println("Ew, an e-dater! BANNED\n");
                case 4 -> System.out.println("You've warmed up enough.\n");
                case 5 -> System.out.println("Error\nNo lobbies found.\n");
                case 6 -> System.out.println("Stop creating lineups, you nerd.\n");
                case 0 -> backToMenu = false;
            }
        } while (backToMenu);
    }

    private static void showCareerMenu() {
        Scanner sc = new Scanner(System.in);
        boolean backToMenu = true;

        do {
            System.out.println("""
                    (0) Back to main menu
                    
                    Rank: Plastic 2
                    RR: 1/100
                    
                    -21RR   Agent: Jett   4/18/0    5-13    Map: Ascent     LOSS
                    -24RR   Agent: Jett   1/21/4    8-13    Map: Fracture   LOSS
                    +8RR    Agent: Jett   6/17/1    13-1    Map: Pearl      WIN
                    -27RR   Agent: Jett   5/13/0    1-13    Map: Breeze     LOSS""");
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
        String[] agents = {"Brimstone", "Phoenix", "Sage", "Sova", "Viper", "Cypher", "Reyna", "Killjoy", "Breach", "Omen", "Jett", "Raze", "Skye", "Yoru", "Astra", "Kayo", "Chamber", "Neon", "Harbor"};
        for (int i = 0; i < agents.length; i++) {
            System.out.println(i + "." + agents[i]);
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
    private Main() {}
}