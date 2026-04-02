public class Client extends Users{
    protected String street;

    public Client(int id, String username, String cpf, String email, String password, String phone, String userType, String street) {
        super(id, username, cpf, email, password, phone, userType);
        this.street = street;
    }

    @Override
    public String toString(){
        return super.toString()+", Street = "+street;
    }
}