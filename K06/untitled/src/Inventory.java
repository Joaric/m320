import java.util.ArrayList;

public class Inventory {
    ArrayList<Item> items = new ArrayList<Item>();
    public void createItem(String name, int price) {
        Item item = new Item(name, price);
        items.add(item);
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}
