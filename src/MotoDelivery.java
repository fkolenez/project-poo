public class MotoDelivery extends Delivery {
    public MotoDelivery(Order order) { super(order); }

    @Override
    public void performDelivery(){ System.out.println("Entrega sendo realizada por moto"); }
}
