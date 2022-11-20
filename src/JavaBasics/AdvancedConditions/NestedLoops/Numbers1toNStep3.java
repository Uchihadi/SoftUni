package JavaBasics.AdvancedConditions.NestedLoops;

import java.util.Scanner;

public class Numbers1toNStep3 {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);

        // Final Number n
        int n = Integer.parseInt(scanner.nextLine());

        // Print numbers from 1 to n with Steps of 3
        for ( int i = 1; i <= n; i = i + 3){
            System.out.print(i + " ");
        }
    }
}
