package JavaBasics.Conditions.Homework;

import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        String drink = scanner.nextLine();
        String sugar = scanner.nextLine();
        double coffeePrice = 1.00;
        double teaPrice = 0.60;
        double sugarPrice = 0.40;

        if (drink.equals("coffee")) {
            if (sugar.equals("sugar")) {
                double cost = coffeePrice + sugarPrice;
                System.out.printf("Final price: $%.2f", cost);
            } else if (sugar.equals("no")) {
                System.out.printf("Final price: $%.2f", coffeePrice);
            }
        } else if (drink.equals("tea")) {
            if (sugar.equals("sugar")) {
                double cost = teaPrice + sugarPrice;
                System.out.printf("Final price: $%.2f", cost);
            } else if (sugar.equals("no")) {
                System.out.printf("Final price: $%.2f", teaPrice);
            }
        }
    }
}
