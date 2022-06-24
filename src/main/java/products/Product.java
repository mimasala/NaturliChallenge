package products;

import java.io.InputStream;
import java.util.List;

public class Product {
    private String name;
    private String type;
    private String origin;
    private String weight;
    private String size;

    @Override
    public String toString() {
        return "" +
                "\n name='" + name + '\'' +
                "\n type='" + type + '\'' +
                "\n origin='" + origin + '\'' +
                "\n weight='" + weight + '\'' +
                "\n size='" + size + '\'' +
                "\n" +
                "-------------------------------";
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
