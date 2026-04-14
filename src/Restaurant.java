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

    public void  addProduct(Product product){
        productList.add(product);
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

    public List<Product> getProductList() {
        return productList;
    }
}
