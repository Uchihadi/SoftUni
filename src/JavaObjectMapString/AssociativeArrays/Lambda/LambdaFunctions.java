package JavaObjectMapString.AssociativeArrays.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LambdaFunctions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(9);
        nums.add(8);
        nums.add(1);
        nums.forEach(num -> System.out.println(num));
        System.out.println(nums);
    }
}
