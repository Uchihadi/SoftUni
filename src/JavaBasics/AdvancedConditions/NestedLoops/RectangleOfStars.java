package JavaBasics.AdvancedConditions.NestedLoops;

import java.util.Scanner;

public class RectangleOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <= height; row++) {
            for (int column = 1; column <= row; column++) {

                // Prints out the stars as according to the number of rows = columns
                System.out.print(" *");
            }

            // To Print the 2nd row or 3rd row etc.
            System.out.println();
        }
    }
}
