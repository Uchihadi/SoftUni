package JavaFundamentals.Arrays;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine(); // Input the list of numbers in one line

        // Each items in list that split by space will be listed in array
        String[] items = input.split(" ");

        // Create new integer array. Num is an integer array. Length = length of items array
        int[] num = new int[items.length];
        int result = 0;

        for (int i = 0; i < num.length; i++){
            // Extract number from the array position
            num[i] = Integer.parseInt(items[i]);
            if (num[i] % 2 == 0){
                result += num[i];
            }
        }

        System.out.println(result);
    }
}
