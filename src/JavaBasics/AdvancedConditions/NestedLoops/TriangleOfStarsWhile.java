package JavaBasics.AdvancedConditions.NestedLoops;

import java.util.Scanner;

public class TriangleOfStarsWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = Integer.parseInt(scanner.nextLine());

        // Initialise row to 1
        int row = 1;

        // Loop while the row is less than or equals to height
        while (row <= height){

            // Initialise Column, first row will run the print first
            int col = 0;

            // Loop while the incremental column is less than to row
            while (col++ < row) {
                System.out.print("*");
            }

            // New line printed after inner while loop has been executed
            System.out.println();

            // Row has to be incremental till it stops at 8
            row++;
        }

    }
}
