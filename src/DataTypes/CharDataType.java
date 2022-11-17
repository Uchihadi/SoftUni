package DataTypes;

import java.util.Scanner;

public class CharDataType {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        char character = scanner.nextLine().charAt(0);
        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        char third = scanner.nextLine().charAt(0);
        System.out.println(third+ " + " +second+ " + "+first);

        System.out.print((int) character);
    }
}
