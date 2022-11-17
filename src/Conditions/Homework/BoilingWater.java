package Conditions.Homework;

import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        double temp = Double.parseDouble(scanner.nextLine());

        if (temp > 100) {
            System.out.println("The water is boiling");
        } else {
            System.out.println("The water is not hot enough");
        }
    }
}
