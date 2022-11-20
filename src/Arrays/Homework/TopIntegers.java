package Arrays.Homework;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);

        // Input an array of numbers with spaces in between
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        // Starts with first number of the Array
        for (int i = 0; i < numbers.length; i++){

            // Created a boolean condition
            boolean top = true;

            // Second number of the Array
            for (int j = i + 1; j < numbers.length; j++){
                if (numbers[i] <= numbers[j]) {
                    top = false; // Eliminates all the lesser numbers by 2 arrays
                }
            }
            if (top){
                    System.out.print(numbers[i] + " ");
                }
            }
        }
}
