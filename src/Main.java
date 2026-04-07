public class Main {
    public static void main(String[] args) {
        Client client = new Client(1, "lets fuck it", "13055433947", "fuck@gmail.com", "130", "47984384819", "Administrator", "Street Fuck it");
        DeliveryPerson deliveryPerson = new DeliveryPerson(2, "nino", "99999999999", "nino@gmail.com", "031", "4783281490", "Usuário", true);

        System.out.println("Client: ");
        System.out.println(client);
        System.out.println("Entregador: ");
        System.out.println(deliveryPerson);
    }
}