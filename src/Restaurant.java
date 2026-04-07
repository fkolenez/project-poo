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

    public List<Product> getProductList() {
        return productList;
    }
}
