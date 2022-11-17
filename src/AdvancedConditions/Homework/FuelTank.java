package AdvancedConditions.Homework;

import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        String fuelType = scanner.nextLine();
        int fuel = Integer.parseInt(scanner.nextLine());

        if (fuel >= 25){
            fuelType = fuelType.toLowerCase();
            System.out.printf("You have enough %s.", fuelType);
        } else if (fuel < 25 && fuel > 0) {
            fuelType = fuelType.toLowerCase();
            System.out.printf("Fill your tank with %s!", fuelType);
        } else {
            System.out.println("Invalid fuel!");
        }
    }
}
