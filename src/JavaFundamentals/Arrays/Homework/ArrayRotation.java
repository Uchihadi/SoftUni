package JavaFundamentals.Arrays.Homework;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rotations = Integer.parseInt(scanner.nextLine());
        int first = 0;

        for (int i = 0; i < rotations; i++){
            first = arr[0];

            for (int j = 0; j < arr.length - 1; j++){
                arr[j] = arr[j+1];
            }

            arr[arr.length - 1] = first;
        }

        for (var item:arr) {
            System.out.print(item + " ");
        }
    }
}
