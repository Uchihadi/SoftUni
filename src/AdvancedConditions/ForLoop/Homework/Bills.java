package AdvancedConditions.ForLoop.Homework;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        int mths = scanner.nextInt();
        double waterCount = 0;
        double internetCount = 0;
        double totalCost = 0;

        for (int i = 1; i <= mths; i++) {
            double cost = scanner.nextDouble();
            totalCost += cost;
            waterCount += 20;
            internetCount += 15;
        }
        double otherCost = (totalCost + waterCount + internetCount)*1.2;
        double avgCost = (otherCost + totalCost + waterCount + internetCount) / mths;


        System.out.printf("Electricity: $%.2f\n", totalCost);
        System.out.printf("Water: $%.2f\n", waterCount);
        System.out.printf("Internet: $%.2f\n", internetCount);
        System.out.printf("Other: $%.2f\n", otherCost);
        System.out.printf("Average: $%.2f\n", avgCost);
    }
}
