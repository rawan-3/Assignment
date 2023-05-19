public class MenuItem {
    private String item;
    private String type;
    private double price;

    public MenuItem(String item, String type, double price) {
        this.item = item;
        this.type = type;
        this.price = price;
    }

    public String getItem() {
        return this.item;
    }

    public String getType() {
        return this.type;
    }

    public double getPrice() {
        return this.price;
    }
}
