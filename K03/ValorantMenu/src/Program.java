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