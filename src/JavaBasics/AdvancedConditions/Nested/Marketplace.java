package JavaBasics.AdvancedConditions.Nested;

import java.util.Scanner;

public class Marketplace {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String day = scanner.nextLine();
        double BWeekday = 2.50;
        double BWeekend = 2.70;
        double AWeekday = 1.30;
        double AWeekend = 1.60;
        double KWeekday = 2.20;
        double KWeekend = 3.00;

        if (product.equals("Banana")) {
            if (day.equals("Weekday")){
                System.out.printf("%.2f", BWeekday);
            } else {
                System.out.printf("%.2f", BWeekend);
            }
        }

        if (product.equals("Apple")) {
            if (day.equals("Weekday")){
                System.out.printf("%.2f", AWeekday);
            } else {
                System.out.printf("%.2f", AWeekend);
            }
        }

        if (product.equals("Kiwi")) {
            if (day.equals("Weekday")){
                System.out.printf("%.2f", KWeekday);
            } else {
                System.out.printf("%.2f", KWeekend);
            }
        }
    }
}
