package TUI;

import AllProducts.AllProducts;
import GiftBox.GiftBoxUI;
import Team.Team;

import java.util.Scanner;

public class TUI {

    private final AllProducts products = new AllProducts();
    private final Team team = new Team();
    private final GiftBoxUI giftBox = new GiftBoxUI();

    public void initTUI() {

        System.out.println(" \t \t \t \t \t \t Natürli Website");
        String LINE = "-------------------------------------------------------------------";
        System.out.println(LINE);
        System.out.println("\n");
        System.out.println("[1] Products");
        System.out.println("[2] Team");
        System.out.println("[3] Box");
        getUserInput();
    }

    public void getUserInput() {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        while (i == 0){
             int response = sc.nextInt();
             if (response == 1) {
                 products.allProductsUI();
                 i++;
             } else if (response == 2) {
                 team.teamUI();
                 i++;
            } else if (response == 3) {
                 giftBox.giftBoxUI();
                 i++;
            } else {
                 System.out.println("Wrong Input");
             }
        }
    }
}
