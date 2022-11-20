package JavaBasics.Conditions.Homework;

import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        // The conditions below must run at same time (simultaneously)
        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }
    }
}
