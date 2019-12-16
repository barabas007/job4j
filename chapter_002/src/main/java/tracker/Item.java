package tracker;
public class Item {
    private String id;
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public static String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public static void setName(String name) {
        this.name = name;
    }

    public Item(Item item) {
    }
}
