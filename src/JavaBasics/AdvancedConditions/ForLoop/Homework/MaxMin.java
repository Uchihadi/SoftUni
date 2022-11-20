package JavaBasics.AdvancedConditions.ForLoop.Homework;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++){
            int num = Integer.parseInt(scanner.nextLine());

            // If number input > MIN_VALUE, then MIN_VALUE will override with input
            if (num > maxNum){
                maxNum = num;
            }

            // If number input < MAX_VALUE, then MAX_VALUE will override with input
            if (num < minNum){
                minNum = num;
            }
        }
        System.out.println("Max number: " +maxNum);
        System.out.println("Min number: " +minNum);
    }
}
