package AllProducts;

import products.LoadData;
import products.Product;

import java.util.Arrays;
import java.util.Scanner;

public class AllProducts {

    private final Scanner sc = new Scanner(System.in);

    public void allProductsUI(){
        System.out.println(" \t \t \t \t \tWhat do you wanna see?");
        String line = "-------------------------------------------------------------------";
        System.out.println(line);
        System.out.println("\n");
        System.out.println("[1] Get All Products");
        System.out.println("[2] Filter by Type");
        System.out.println("[3] Filter by Name");

        getUserInput();
    }

    public void getUserInput(){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i == 0){
            int response = sc.nextInt();
            if (response == 1){
                printAll();
                i++;
            }else if (response == 2){
                filterByType();
                i++;
            }else if (response == 3){
                filterByName();
                i++;
            }else {
                System.out.println("Wrong Input");
            }
        }
    }

    public void printAll(){
    Product[] allProducts = LoadData.loadproducts();
        Arrays.stream(allProducts).map(Product::toString).forEach(System.out::println);
    }

    public void filterByType(){
        Product[] allProducts = LoadData.loadproducts();
        System.out.println("Enter a Type: ");
        String res = sc.next();
        for (Product allProduct : allProducts) {
            try {
                if (allProduct.getType().equals(res)) {
                    System.out.println(allProduct);
                }
            } catch (Exception ignored) {
            }
        }
    }

    public void filterByName(){
        Product[] allProducts = LoadData.loadproducts();
        System.out.println("Enter a Name: ");
        String res = sc.next();
        for (Product allProduct : allProducts) {
            try {
                if (allProduct.getName().equals(res)) {
                    System.out.println(allProduct);
                }
            } catch (Exception ignored) {
            }
        }
    }


}
