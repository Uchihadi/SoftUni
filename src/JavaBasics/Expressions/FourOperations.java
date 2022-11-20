package JavaBasics.Expressions;

import java.util.Scanner;

public class FourOperations {
    public static void main(String[] args) {
        // Write code here
        System.out.println("Hello world!");
        Scanner scanner = new Scanner (System.in);
        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());

        double add = num1 + num2;
        double minus = num1 - num2;
        double times = num1 * num2;
        double div = num1 / num2;

        System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, add);
        System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, minus);
        System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, times);
        System.out.printf("%.2f / %.2f = %.2f%n", num1, num2, div);
    }
}