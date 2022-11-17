package AdvancedConditions.ForLoop.Homework;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);

        // Declare how many inputs user wants
        int n = Integer.parseInt(scanner.nextLine());

        // Calls out the Minimum Integer value
        int maxnum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++){
            // Input the Array of Numbers based on input count n
            int num = Integer.parseInt(scanner.nextLine());

            // If the number input is bigger than the min_value, min_value will then be override with the input number
            // It will then loop through till it finds the max number
            if (num > maxnum){
                maxnum = num;
            }
            System.out.println(maxnum);
        }

        // Prints out the maximum number from the Loop
        System.out.println(maxnum);
    }
}
