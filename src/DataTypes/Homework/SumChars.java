package DataTypes.Homework;

import java.util.Scanner;

public class SumChars {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i < n; i++){
            char character = scanner.nextLine().charAt(0);
            int ascii = (int) character;
            sum += ascii;
        }
        System.out.println(sum);
    }
}
