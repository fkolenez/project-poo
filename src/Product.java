import java.net.Authenticator;

public class Product {
    private int id;
    public String name;
    public String description;
    protected double price;
    private Category category;
    private int stock;

    public Product(int id, String name, String description, double price, Category category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void reduceStock(int qty) {
        if(qty <= stock) {
            stock -= qty;
        } else {
            System.out.println("Estoque insuficiente!");
        }
    }

    public void addStock(int qty) {
        if (qty > 0) {
            stock += qty;
        }
    }
}