/**
 * Starts program where a User can create a profile
 * @author Aryan Aravinth
 * @version 1.1
 * @since 13-12-2022
 */

public class Program {
    public static void main(String[] args) {
        try {
            Menu menu = new Menu();
            boolean exit = true;
            do {
                exit = menu.printMenu();
            } while (exit);
        } catch (WrongInputException e) {
            System.out.println("An error occurred.");
        }
    }

    private Program() {}
}