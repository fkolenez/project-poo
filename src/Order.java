import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private String status;

    // Agregação
    private Client client;
    private DeliveryPerson deliveryPerson;
    private Restaurant restaurant;

    // Abstração
    private Payment payment;
    private Delivery delivery;

    // Composição
    private List<OrderItems> items = new ArrayList<>();

    public Order(int id, Client client) {
        this.id = id;
        this.client = client;
        this.status = "EM ABERTO";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void addItem(Product product, int qty) {
        if(!status.equals("EM ABERTO")) {
            System.out.println("Não é possível incluir itens em um pedido que não está aberto!");
        } else {
            int orderId = 1;

            if(!items.isEmpty()) {
                orderId = items.size()+1;
            }

            OrderItems item = new OrderItems(orderId, product, qty);
            items.add(item);

            System.out.println("Item "+product.getName()+" adicionando com Sucesso!");
        }
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