public abstract class Delivery {
    protected Order order;

    public Delivery(Order order) {
        this.order = order;
    }

    public void startDelivery() {
        System.out.println("Preparando entrega do pedido #"+ order.getId());
    }

    public abstract void performDelivery();
}