public class DroneDelivery extends Delivery{
    public DroneDelivery(Order order){ super(order); }

    @Override
    public void performDelivery() { System.out.println("Entrega realizada por drone"); }
}
