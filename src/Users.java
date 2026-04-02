public class Users {
    private int id;
    public String username;
    protected String cpf;
    public String email;
    private String password;
    public String phone;
    public String userType;

    public Users(int id, String username, String cpf, String email, String password, String phone, String userType){
        this.id = id;
        this.username = username;
        this.cpf = cpf;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "User: " +
                "   \n id = " + id +
                ", Username = '" + username + '\'' +
                ", Cpf = '" + cpf + '\'' +
                ", Email = '" + email + '\'' +
                ", Phone = '" + phone + '\'' +
                ", UserType = '" + userType + '\'';
    }
}
