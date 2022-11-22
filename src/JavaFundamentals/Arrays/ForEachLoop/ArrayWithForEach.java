package JavaFundamentals.Arrays.ForEachLoop;

import java.util.Scanner;

public class ArrayWithForEach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = {1, 2, 3, 4, 5};

        // num = each of the array list; numbers = entire array list
        for(int num: nums) {
            System.out.print(num + " ");
        }
    }
}
