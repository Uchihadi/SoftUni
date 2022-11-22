package JavaFundamentals.Arrays.Homework;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int sum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < arr.length - 1; i++){
            int num = arr[i];

            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (i == j) {
                    continue;
                }
                int num2 = arr[j];

                if (num + num2 == sum){
                    System.out.printf("%d %d%n", num, num2);
                }
            }
        }
    }
}
