package Arrays.Homework;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] num = new int[n];
        int total = 0;

        // To store values into the Array only
        for (int i = 0; i < n; i++){
            num[i] = Integer.parseInt(scanner.nextLine());
            total += num[i];
        }

        // To store print values in the Array, starting from 0 to number length
        for (int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }

        System.out.print("\n");
        System.out.println(total);
    }
}
