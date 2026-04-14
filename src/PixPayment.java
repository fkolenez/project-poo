public class PixPayment implements Payment {
    public boolean isPayed(double value) {
        /* TODO: Implementar as validações! */
        System.out.println("Pagamento aprovado!");
        return true;
    }

    public String getPayment() {
        return "Pix";
    }
}
