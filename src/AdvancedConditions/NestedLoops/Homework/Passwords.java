package AdvancedConditions.NestedLoops.Homework;

import java.util.Scanner;

public class Passwords {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int firstNum = 2; firstNum <= n; firstNum += 2) {
            for (int secondNum = 1; secondNum <= n; secondNum += 2) {
                long mult = firstNum * secondNum;
                System.out.print(" " + firstNum + secondNum + mult);
            }
        }
        System.out.println();
    }
}
