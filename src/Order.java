import java.time.Period;
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
        this.status = "OPEN";
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
        if(!status.equals("OPEN")) {
            System.out.println("Não é possível incluir itens em um pedido que não está aberto!");
        } else {
            int productOrderId = 1;

            if(!items.isEmpty()) {
                productOrderId = items.size()+1;
            }

            OrderItems item = new OrderItems(productOrderId, product, qty);
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

    public void startDelivery() {
        if(!status.equals("CONFIRMED")) {
            System.out.println("O pedido precsar estar confirmado antes de ser enviado!");
            return;
        }

        if(deliveryPerson == null) {
            System.out.println("Não foi definido entregador!");
            return;
        }

        if(delivery == null) {
            System.out.println("Não foi definida a entrega!");
        }

        status = "OUT TO DELIVERY";
        System.out.println("O pedido saiu para entrega!");
    }

    public void finishDelivery() {
        double total = calculateTotal();

        if(!status.equals("OUT TO DELIVERY")) {
            System.out.println("O pedido não saiu para entrega para ser finalizado! PRA CIMA DE MOA? "+giggles());
            return;
        }

        if(payment == null) {
            System.out.println("Forma de pagamento não informada!");
            return;
        }

        System.out.println("*-*-*-*-* Finalizando pedido! *-*-*-*-*");
        payment.isPayed(total);

        status = "COMPLETED";

        /* Polimorfismo da classe abstrata! */
        delivery.startDelivery();
        delivery.performDelivery();

        System.out.println("Pedido finalizado com sucessexo");
    }

    public void resumeOrder() {
        System.out.println("\n *-*-*-*-* Resumo do pedido *-*-*-*-*\n");
        System.out.println("Pedido #"+id);
        System.out.println("Cliente: "+client.getUsername());
        System.out.println("Endereço: "+client.getStreet());
        System.out.println("Status do pedido: "+status);

        System.out.println("Itens do pedido: ");
        for(OrderItems item : items) {
            System.out.println("- "+item);
        }

        System.out.println("Preço: "+String.format("%.2f", calculateTotal()));

        if(payment != null) {
            System.out.println("Pagamento: "+payment.getPayment());
        }

        if(deliveryPerson != null) {
            System.out.println("Entregador: "+deliveryPerson.getName());
        }

        if(delivery != null) {
            System.out.println("Entrega: "+ delivery.getClass().getSimpleName());
        }
    }

    public double calculateTotal(){
        double total = 0;
        for(OrderItems item : items) {
            total += item.getSubTotal();
        }

        return total;
    }

    public void confirmOrder() {
        /* Pedido não está em aberto */
        if(!status.equals("OPEN")) {
            System.out.println("O pedido não pode ser confirmado pois não está em aberto!");
        } else {
            /* nn tem cliente no bagulho */
            if(client == null) {
                System.out.println("Cliente inválido ou não informado!");
            }

            if(items.isEmpty()) {
                System.out.println("Adicione itens para confirmar o pdiddy");
            }

            for(OrderItems item : items) {
                item.getProduct().reduceStock(item.qty);
            }

            status = "CONFIRMED";
            System.out.println("Pedido confirmado");
        }
    }

    public void removeItem(String productName) {
        if(!status.equals("OPEN")) {
            System.out.println("coe paizao ta tirano coisa que nao pode");
        } else {
            boolean removed = items.removeIf(
                    item -> item.getProduct().getName().equalsIgnoreCase(productName)
            );

            if(removed) {
                System.out.println("Item "+productName+" removido com sucesso!");
            } else {
                System.out.println("Item "+productName+" não encontrado!");
            }
        }
    }

    public void definePayment(Payment payment) {
        this.payment = payment;
        System.out.println("Pagamento recebido!"+payment.getPayment());
    }

    public void defineDelivery(Delivery delivery) {
        this.delivery = delivery;
        System.out.println("Entrega definida como: "+ delivery.getClass().getSimpleName());
    }

    public void defineDeliveryPerson(DeliveryPerson deliveryPerson) {
        this.deliveryPerson = deliveryPerson;
        System.out.println("Entregador definido como" + deliveryPerson.getName());
    }

    public String dontEvenGetDownAndAlreadyRaisedUp() {
       return "bruna voce ja parou pra pensar";
    }

    public String giggles(){
        return "HAHAHA né";
    }

    public void  finalizeOrder() {
        double total = calculateTotal();
    }
}