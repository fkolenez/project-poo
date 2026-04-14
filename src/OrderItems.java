public class OrderItems {
    private int id;
    protected Product product;
    protected int qty;
    protected double unitPrice;

    public OrderItems(int id, Product product, int qty, double unitPrice) {
        this.id = id;
        this.product = product;
        this.qty = qty;
        this.unitPrice = product.getPrice();
    }

    public double getSubTotal() {
        return unitPrice*qty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
