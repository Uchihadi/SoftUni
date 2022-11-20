package JavaBasics.Exam;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        String sugarLevel = scanner.nextLine();
        int drinks = Integer.parseInt(scanner.nextLine());

        if (type.equals("Espresso")){
            if (sugarLevel.equals("Without")){
                if (drinks >= 5) {
                    double cost = drinks * 0.9 * 0.65 * 0.75;
                    if (cost > 15) cost *= 0.75;
                    System.out.printf("You bought %d cups of %s for %.2f dollars.", drinks, type, cost);
                } else {
                    double cost = drinks * 0.9 * 0.65;
                    if (cost > 15) cost *= 0.75;
                    System.out.printf("You bought %d cups of %s for %.2f dollars.", drinks, type, cost);
                }
            } else if (sugarLevel.equals("Normal")) {
                if (drinks >= 5) {
                    double cost = drinks * 0.75;
                    if (cost > 15) cost *= 0.75;
                    System.out.printf("You bought %d cups of %s for %.2f dollars.", drinks, type, cost);
                } else {
                    double cost = drinks;
                    if (cost > 15) cost *= 0.75;
                    System.out.printf("You bought %d cups of %s for %.2f dollars.", drinks, type, cost);
                }
            } else if (sugarLevel.equals("Extra")) {
                if (drinks >= 5) {
                    double cost = drinks * 1.2 * 0.75;
                    if (cost > 15) cost *= 0.75;
                    System.out.printf("You bought %d cups of %s for %.2f dollars.", drinks, type, cost);
                } else {
                    double cost = drinks * 1.2;
                    if (cost > 15) cost *= 0.75;
                    System.out.printf("You bought %d cups of %s for %.2f dollars.", drinks, type, cost);
                }
            }
        } else if (type.equals("Cappuccino")){
            if (sugarLevel.equals("Without")){
                double cost = drinks * 0.65;
                if (cost > 15) cost *= 0.75;
                System.out.printf("You bought %d cups of %s for %.2f dollars.", drinks, type, cost);
            } else if (sugarLevel.equals("Normal")) {
                double cost = drinks * 1.2;
                if (cost > 15) cost *= 0.75;
                System.out.printf("You bought %d cups of %s for %.2f dollars.", drinks, type, cost);
            } else if (sugarLevel.equals("Extra")) {
                double cost = drinks * 1.6;
                if (cost > 15) cost *= 0.75;
                System.out.printf("You bought %d cups of %s for %.2f dollars.", drinks, type, cost);
            }
        } else if (type.equals("Tea")){
            if (sugarLevel.equals("Without")){
                double cost = drinks * 0.5 * 0.65;
                if (cost > 15) cost *= 0.75;
                System.out.printf("You bought %d cups of %s for %.2f dollars.", drinks, type, cost);
            } else if (sugarLevel.equals("Normal")) {
                double cost = drinks * 0.6;
                if (cost > 15) cost *= 0.75;
                System.out.printf("You bought %d cups of %s for %.2f dollars.", drinks, type, cost);
            } else if (sugarLevel.equals("Extra")) {
                double cost = drinks * 0.7;
                if (cost > 15) cost *= 0.75;
                System.out.printf("You bought %d cups of %s for %.2f dollars.", drinks, type, cost);
            }
        }
    }
}
