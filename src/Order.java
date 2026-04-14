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

    public int getId() {
        return id;
    }

    public void addItem(OrderItems item) {
        items.add(item);
    }

    public void setId(int id) {
        this.id = id;
    }

    public DeliveryPerson getDeliveryPerson() {
        return deliveryPerson;
    }

    public void setDeliveryPerson(DeliveryPerson deliveryPerson) {
        this.deliveryPerson = deliveryPerson;
    }

    public List<OrderItems> getItems() {
        return items;
    }

    public void setItems(List<OrderItems> items) {
        this.items = items;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
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