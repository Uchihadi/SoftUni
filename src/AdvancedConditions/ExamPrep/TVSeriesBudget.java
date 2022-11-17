package AdvancedConditions.ExamPrep;

import java.util.Scanner;

public class TVSeriesBudget {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int series = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < series; i++){
            String seriesName = scanner.nextLine();
            double price = Double.parseDouble(scanner.nextLine());

            if (seriesName.equals("Thrones")){
                price *= 0.5;
            } else if (seriesName.equals("Lucifer")){
                price *= 0.6;
            } else if (seriesName.equals("Protector")) {
                price *= 0.7;
            } else if (seriesName.equals("TotalDrama")) {
                price *= 0.8;
            } else if (seriesName.equals("Area")) {
                price *= 0.9;
            }
            budget -= price;

        }
        if (budget < 0){
            System.out.printf("You need %.2f$ more to buy the series!", Math.abs(budget));
        } else {
            System.out.printf("You bought all the series and left with %.2f$", Math.abs(budget));
        }
    }
}
