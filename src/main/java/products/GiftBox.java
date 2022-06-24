package products;

import java.util.Arrays;

public class GiftBox {
    private String name;
    private Product[] products;


    public Product[] getProducts() {
        return products;
    }
    public void setProducts(Product[] products) {
        this.products = products;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "GiftBox{\n" + "products=" + Arrays.toString(products) + '}';
    }
}
