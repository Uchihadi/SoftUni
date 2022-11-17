package AdvancedConditions.NestedLoops;

import java.util.Scanner;

public class EvenPowersof2 {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);

        // Integer variable for the maximum power
        int n = Integer.parseInt(scanner.nextLine());

        // Declare new Integer variable num
        int num = 1;

        // Run the loop for Powers of 2; initialise with 0
        for (int i = 0; i <= n; i += 2){

            // If Powers are bigger than 0, then have a gap between each and every for-loop
            // For first loop, this if-condition does not trigger
            if (i > 0){
                System.out.print(", ");
            }

            // Prints out the numbers starting with 1
            System.out.print(num);
            num = num * 2 * 2;
        }
    }
}
