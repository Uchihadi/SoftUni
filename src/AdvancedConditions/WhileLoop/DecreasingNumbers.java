package AdvancedConditions.WhileLoop;

import java.util.Scanner;

public class DecreasingNumbers {
    public static void main(String[] args) {
        // While Loops --> Repeat a block of codes till certain conditions are met
        // While Loops are always true
        // For loops are used when you know the end of iterations, while loop does not
        // While loops can be infinite, hence use break operator to exit from the loop
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        // can also use scanner.nextInt() instead of Integer.parseInt

        while (n >= 1) {
            System.out.println(n);
            n--;
        }
    }
}
