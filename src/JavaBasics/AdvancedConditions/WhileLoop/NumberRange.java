package JavaBasics.AdvancedConditions.WhileLoop;

import java.util.Scanner;

public class NumberRange {
    public static void main(String[] args) {
        // Write code here
        // Scanner Input num as a variable
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        // while loops will keep on repeating till it meets conditions
        // As long as number is out of 1 to 100, it will loop repeatedly
        while ( num <= 1 || num >= 100) {
            num = scanner.nextInt();
        }

        // Once number is within range, it will end the loop
        System.out.println(num);
    }
}
