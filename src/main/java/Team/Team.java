package Team;

import products.GiftBox;
import products.LoadData;

import java.util.Arrays;
import java.util.Scanner;

public class Team {

    private String name;
    private String role;
    private String description;

    public void teamUI(){
        System.out.println(" \t \t \t \t \tWhat do you wanna see?");
        String line = "-------------------------------------------------------------------";
        System.out.println(line);
        System.out.println("\n");
        System.out.println("[1] Get All Teammembers");
        System.out.println("[2] Filter by Name");

        getUserInput();

    }

    public void getUserInput(){

        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i == 0){
            int response = sc.nextInt();
            if (response == 1){
                getAll();
                i++;
            }else if (response == 2){
                filterByName();
                i++;
            }else {
                System.out.println("Wrong Input");
            }
        }
    }

    public void getAll(){
        Team[] teams = LoadData.loadTeam();
        Arrays.stream(teams).map(Team::toString).forEach(System.out::println);
    }

    public void filterByName(){
        Scanner sc = new Scanner(System.in);
        Team[] teams = LoadData.loadTeam();
        System.out.println("Search Team by name: ");
        String res = sc.next();
        for (Team team : teams) {
            try {
                if (team.getName().contains(res)) {
                    System.out.println(team);
                }
            } catch (Exception ignored) {
            }
        }
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Team{" + "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
