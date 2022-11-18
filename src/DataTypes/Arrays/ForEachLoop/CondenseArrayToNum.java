package DataTypes.Arrays.ForEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        if (nums.length == 1) {
            System.out.println(nums[0]);
        } else {
            while (nums.length != 1) {
                int[] condensed = new int[nums.length - 1];
                for (int i = 0; i < nums.length - 1; i++){
                    condensed[i] = nums[i] + nums[i + 1];
                }
                nums = condensed;
            }
            System.out.println(nums[0]);
        }
    }
}
