package DataTypes;

import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        char third = scanner.nextLine().charAt(0);
        System.out.print("" + first + second + third);
    }
}

