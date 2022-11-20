package JavaBasics.AdvancedConditions.ForLoop.Homework;

import java.util.Scanner;

public class BaseExponent {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        int p = Integer.parseInt(scanner.nextLine()); //exponent
        int n = Integer.parseInt(scanner.nextLine()); //base

        // Initialise the final number into 1
        int num = 1;

        // Executes loops for 5 times where the number*2
        for (int i = 0; i < p; i++){
            num = num * n;
        }

        System.out.println(num);
    }
}
