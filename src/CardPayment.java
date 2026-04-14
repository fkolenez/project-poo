public class CardPayment implements Payment{
    public boolean isPayed(double value){
        System.out.println("Pagamento via cartão aprovado!");
        return true;
    }
    public String getPayment() {
        return "Cartão";
    }
}
