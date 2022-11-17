package AdvancedConditions.Homework;

import java.util.Scanner;

public class Product3Numbers {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());
        double num3 = Double.parseDouble(scanner.nextLine());

        if (num1 == 0 || num2 == 0 || num3 == 0) {
            System.out.println("zero");
        } else {
            int negativeNumCount = 0;
            if (num1 < 0){
                negativeNumCount++;
            }
            if (num2 < 0){
                negativeNumCount++;
            }
            if (num3 < 0){
                negativeNumCount++;
            }

            // Negative Numbers have no remainders
            if (negativeNumCount % 2 == 0){
                System.out.println("positive");
            } else {
                System.out.println("negative");
            }
        }
    }
}
