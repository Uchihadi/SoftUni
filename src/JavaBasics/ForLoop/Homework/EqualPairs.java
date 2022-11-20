package JavaBasics.ForLoop.Homework;

import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);

        // Input how many key value pairs that you need (2 = 2 key pairs)
        int n = Integer.parseInt(scanner.nextLine());
        int maxDiff = 0;
        int prevSum = 0;

        for (int i = 0; i < n; i++){
            int i1 = Integer.parseInt(scanner.nextLine());
            int i2 = Integer.parseInt(scanner.nextLine());
            int sum = i1+i2;

            // Sets the first for-loop for prevSum to be Sum
            if (i == 0) {
                prevSum = sum;
            }

            int diff = Math.abs (prevSum - sum);

            if (diff > maxDiff) {
                maxDiff = diff;
            }
            prevSum = sum;
        }

        if (maxDiff == 0){
            System.out.printf("Yes, value=%d", prevSum);
        } else {
            System.out.printf("No, maxdiff=%d", maxDiff);
        }
    }
}
