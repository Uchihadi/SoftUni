package Arrays.ForEachLoop;

import java.util.Scanner;

public class ArrayWithForEach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = {1, 2, 3, 4, 5};

        for(int num: nums) {
            System.out.print(num + " ");
        }
    }
}
