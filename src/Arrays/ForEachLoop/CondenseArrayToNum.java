package Arrays.ForEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        // Access length property; if array length = 1 then print the position 0 of the array
        // If not
        if (nums.length == 1) {
            System.out.println(nums[0]);
        } else {
            while (nums.length != 1) {
                int[] condensed = new int[nums.length - 1];
                for (int i = 0; i < condensed.length; i++){
                    condensed[i] = nums[i] + nums[i + 1];
                }

                // Update nums array and access the condensed array to nums
                nums = condensed;
            }
            System.out.println(nums[0]);
        }
    }
}
