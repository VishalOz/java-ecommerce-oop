import java.util.ArrayList;
import java.util.List;

public class Shops {
    private String name;
    private String location;
    private ArrayList<Product> products;

    public Shops(String name, String location) {
        this.name = name;
        this.location = location;
        this.products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public String getLocation() {
        return location;
    }
    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void addProduct(Product product) {
        products.add(product);
    }


}
