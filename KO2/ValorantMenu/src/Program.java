public class Program {
    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();
        boolean exit = true;
        do {
            exit = menu.printMenu();
        } while (exit);
    }

    private Program() {}
}