import java.util.ArrayList;

public class Shops {
    private String name;
    private ArrayList<Product> products;

    public Shops(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void addProduct(Product product) {
        products.add(product);
    }


}
