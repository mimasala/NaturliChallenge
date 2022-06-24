package GiftBox;

import products.GiftBox;
import products.LoadData;

import java.util.Arrays;
import java.util.Scanner;

public class GiftBoxUI {
    public static Scanner sc = new Scanner(System.in);

    public void giftBoxUI(){
        System.out.println(" \t \t \t \t \tWhat do you wanna see?");
        String line = "-------------------------------------------------------------------";
        System.out.println(line);
        System.out.println("\n");
        System.out.println("[1] Get All gift boxes");
        System.out.println("[2] Filter by Name");

        getUserInput();

    }

    public void getUserInput(){
        int i = 0;
        while (i == 0){
            int response = sc.nextInt();
            if (response == 1){
                printAll();
                i++;
            }else if (response == 2){
                filterByName();
                i++;
            }else {
                System.out.println("Wrong Input");
            }
        }
    }

    public void printAll(){
        GiftBox[] giftBoxes = LoadData.loadGiftBoxes();
        Arrays.stream(giftBoxes).map(products.GiftBox::toString).forEach(System.out::println);
    }

    public void filterByName(){
        products.GiftBox[] giftBoxes = LoadData.loadGiftBoxes();
        System.out.println("Search GiftBox by name: ");
        String res = sc.next();
        System.out.println(res);
        for (products.GiftBox giftBox : giftBoxes) {
            try {
                if (giftBox.getName().contains(res)) {
                    System.out.println(giftBox);
                }
            } catch (Exception ignored) {
            }
        }
    }
}
