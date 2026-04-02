public class Entregador extends Users {
    public boolean available;

    public Entregador(int id, String username, String cpf, String email, String password, String phone, String userType, Boolean available) {
        super(id, username, cpf, email, password, phone, userType);
        this.available = available;
    }

    @Override
    public String toString(){
        return super.toString()+", available = "+(available ? "Sim" : "Não");
    }
}
