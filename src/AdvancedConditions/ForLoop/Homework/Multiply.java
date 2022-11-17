package AdvancedConditions.ForLoop.Homework;

import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= 10; i++){
            sum++;
            int nSum = n*sum;
            System.out.printf("%d x %d = %d\n", n, i, nSum);
        }
    }
}
