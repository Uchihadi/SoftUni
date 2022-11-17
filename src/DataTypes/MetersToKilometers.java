package DataTypes;

import java.util.Scanner;

public class MetersToKilometers {
    public static void main(String[] args) {
        // Write your solution here
        Scanner scanner = new Scanner(System.in);
        double metre = Double.parseDouble(scanner.nextLine());
        double kilometre = metre / 1000;

        System.out.printf("%.2f", kilometre);

    }
}
