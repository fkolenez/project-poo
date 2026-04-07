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


}
