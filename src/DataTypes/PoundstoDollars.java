package DataTypes;

import java.util.Scanner;

public class PoundstoDollars {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        double pounds = Double.parseDouble(scanner.nextLine());
        double dollars = pounds * 1.31;
        System.out.printf("%.3f", dollars);
    }
}
