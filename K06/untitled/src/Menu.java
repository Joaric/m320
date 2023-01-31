import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    Inventory inv = new Inventory();
    public void printMenu() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("""
                    (1) Add item to inventory
                    (2) Show items
                    (0) Quit""");
        } while (menuOption(sc.nextInt()));
    }
    public boolean menuOption(int index) {
        switch (index) {
            case 1 -> inv.createItem(defineItemName(), defineItemPrice());
            case 2 -> printItems();
            case 0 -> {
                return false;
            }
        }
        return true;
    }
    public String defineItemName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name of item: ");
        return sc.nextLine();
    }
    public int defineItemPrice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Price of item: ");
        return sc.nextInt();
    }

    public void printItems() {
        for (int i = 0; i < inv.getItems().size(); i++) {
            System.out.println("Name: " + inv.getItems().get(i).getName());
            System.out.println("Price: " + inv.getItems().get(i).getPrice());
        }
    }
}
