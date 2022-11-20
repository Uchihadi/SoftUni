package JavaBasics.Conditions.Homework;

import java.util.Scanner;

// Vineyard responsible for 40% of total wine production
// 1 sqm of Land = Y kilos of grapes
// 1 liter of wine = 2.5kg grapes
public class Harvest {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        int vineyardSize = Integer.parseInt(scanner.nextLine());
        double yieldSqm = Double.parseDouble(scanner.nextLine());
        int productionGoal = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double weight = vineyardSize*yieldSqm;
        double litres = weight*0.4 / 2.5;

        double remainingWine = litres - productionGoal;
        double workersWine = remainingWine/workers;
        double wineNeeded = productionGoal - litres;


        if (litres > productionGoal) {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n", litres);
            System.out.printf("%.0f liters left -> %.0f liters per person.", remainingWine, workersWine);
        } else {
            System.out.printf("It will be a tough winter! %.0f liters of wine needed to reach the goal.", wineNeeded);
        }
    }
}
