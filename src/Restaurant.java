import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    public int id;
    public String name;
    protected String address;
    private List<Product> productList = new ArrayList<>();

    public Restaurant(String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void listProducts() {
        if(productList.isEmpty()) {
            System.out.println("Não há produtos cadastrados!");
            return;
        } else {
            System.out.println("-*-*-*- CARDÁPIO DO RESTAURANTE "+name.toUpperCase()+" -*-*-*-");

            for (int i = 0; i < productList.size(); i++) {
                Product product = productList.get(i);
                System.out.println((i+1)+" - "+product);
            }
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}