package products;

import Team.Team;
import com.google.gson.Gson;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;


public class LoadData {
    public static ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
    public static Gson gson = new Gson();

    public static Product[] loadproducts() {
        InputStream inputStream = classLoader.getResourceAsStream("products.json");
        assert inputStream != null;
        Reader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        return gson.fromJson(reader, Product[].class);
    }
    public static GiftBox[] loadGiftBoxes() {
        InputStream inputStream = classLoader.getResourceAsStream("GiftBoxes.json");
        assert inputStream != null;
        Reader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        return gson.fromJson(reader, GiftBox[].class);
    }
    public static Team[] loadTeam() {
        InputStream inputStream = classLoader.getResourceAsStream("Team.json");
        assert inputStream != null;
        Reader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        return gson.fromJson(reader, Team[].class);
    }
}
