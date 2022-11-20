package JavaBasics.ForLoop;

import java.util.Scanner;

public class InfiniteForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialise sum of numbers
        int sum = 0;

        // Initialise Infinite For Loop to execute block of codes
        // For Loop: 1) Initialisation 2) Condition 3) Step 4) Body
        for (; ; ){

            // Input number; Loop only activates why input number
            int num = Integer.parseInt(scanner.nextLine());

            // If number = 0 then break out of this loop to print "Goodbye"
            if (num == 0){
                break;
            }

            // Iteration of the sum of numbers
            sum = sum + num;
            System.out.println(sum);
        }
        System.out.println("Bye");
    }
}
