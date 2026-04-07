import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;

    private Client client;
    private DeliveryPerson deliveryPerson;

    private List<OrderItems> items = new ArrayList<>();

    public Order(int id, Client client) {
        this.id = id;
        this.client = client;
    }

    public void addItem(OrderItems item) {
        items.add(item);
    }

    public double calculateTotal(){
        double total = 0;
        for(OrderItems item : items) {
            total += item.getSubTotal();
        }

        return total;
    }

    public void  finalizeOrder() {
        double total = calculateTotal();
    }
}