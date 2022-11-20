package JavaBasics.Exam;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double priceNight = Double.parseDouble(scanner.nextLine());
        int addCost = Integer.parseInt(scanner.nextLine());

        double additional = addCost * budget / 100;
        double totalCost = 0;

        if (nights > 7) {
            totalCost = (priceNight * 0.95) * nights + additional;

            if (budget >= totalCost) {
                budget -= totalCost;
                System.out.printf("The Smiths will be left with %.2f dollars after the vacation.", budget);
            } else {
                totalCost -= budget;
                System.out.printf("%.2f dollars needed.", totalCost);
            }
        } else {
            totalCost = priceNight * nights + additional;

            if (budget >= totalCost) {
                budget -= totalCost;
                System.out.printf("The Smiths will be left with %.2f dollars after the vacation.", budget);
            } else {
                totalCost -= budget;
                System.out.printf("%.2f dollars needed.", totalCost);
            }
        }
    }
}
