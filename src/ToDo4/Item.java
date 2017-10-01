package ToDo4;

public class Item {
    private String name;
    boolean completed;

    public Item(String name) {
        this.name = name;
        completed = false;
    }

    public void complete() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return name;
    }
}