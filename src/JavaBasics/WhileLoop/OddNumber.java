package JavaBasics.WhileLoop;

import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        // While and For-Loops both repeats a block of codes
        // Using For-Loop when you preliminary know number of Iterations (repeat n times)
        // Use while loop if you don't know when exit conditions will be met (repeated)
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        while (num % 2 == 0) {
            num = scanner.nextInt();
        }

        System.out.println(num);
    }
}
