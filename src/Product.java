public class Product {
    private int id;
    public String name;
    public String description;
    protected double price;
    public Category category;

    public Product(int id, String name, String description, double price, Category category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public String getProductName() {
        return name;
    }
}
