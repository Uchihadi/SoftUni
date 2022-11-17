package DataTypes.Homework;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        // Write your code here
        // Get the remainder and pass the next remaining digits
        // Get the rightmost digit of the number with help of the remainder ‘%’ operator by dividing it by 10 and adding it to the sum.
        // Divide the number by 10 with help of the ‘/’ operator to remove the rightmost digit.
        // Check the base case with n = 0
        // Print or return the sum
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = 0;

        while (n > 0){
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
