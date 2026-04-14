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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
