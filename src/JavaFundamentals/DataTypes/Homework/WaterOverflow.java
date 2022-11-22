package JavaFundamentals.DataTypes.Homework;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int capacity = 255;
        int capacityLeft = capacity;

        for (int i = 0; i < n; i++){
            int water = Integer.parseInt(scanner.nextLine());

            if (capacityLeft - water >= 0) {
                capacityLeft -= water;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
        int filled = capacity - capacityLeft;
        System.out.println(filled);
    }
}
