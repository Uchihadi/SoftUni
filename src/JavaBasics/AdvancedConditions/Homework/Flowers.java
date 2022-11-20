package JavaBasics.AdvancedConditions.Homework;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        int lilias = scanner.nextInt();
        int roses = scanner.nextInt();
        int tulips = scanner.nextInt();
        String season = scanner.nextLine();
        String day = scanner.nextLine();

        int sumOfFlowers = lilias + roses + tulips;

        if (season.equals("Spring") || season.equals("Summer")){
            double liliasCost = 2 * lilias;
            double roseCost = 4.1 * roses;
            double tulipCost = 2.5 * tulips;
            double totalCost = liliasCost + roseCost + tulipCost;

            if (tulips >= 7){
                double discTulipCost = tulipCost*.95;
            }

            if (roses >= 7){
                double discRoseCost = roseCost*.9;
            }

            if (sumOfFlowers >= 20){
                double discTulipCost = tulipCost*.95;
            }
        }
    }
}
