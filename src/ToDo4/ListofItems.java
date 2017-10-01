package ToDo4;

import java.util.ArrayList;
import java.util.List;

public class ListofItems extends ArrayList {

    private List<Item> items;

    public ListofItems() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public Item getItem(int i) {
        return items.get(i);
    }

    public void removeItem(int i) {
        items.remove(i);
    }

    public int size() {
        return items.size();
    }

    @Override
    public String toString() {
        String result = "";
        for(int i = 0; i < items.size(); i++) {
            result += (i+1) + ". " + items.get(i) + "\n";
        }
        return result;
    }
}