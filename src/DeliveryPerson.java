public class DeliveryPerson extends Users {
    public boolean available;

    public DeliveryPerson(int id, String username, String cpf, String email, String password, String phone, String userType, boolean available) {
        super(id, username, cpf, email, password, phone, userType);
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString(){
        return super.toString()+", available = "+(available ? "Sim" : "Não");
    }
}
