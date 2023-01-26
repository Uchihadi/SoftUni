package iSprintAssessment260123;

// Create a function to get the sum of all positive numbers less than N that are multiples of 3 or 5
// N is ranging from 1 to 100000 (inclusive)

import java.util.*;

public class MathHelperAlternative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            System.out.println(getSum(n));
        }
    }

    public static long getSum(int n) {
        long sum = 0;
        for (int i = 3; i < n; i += 3) {
            sum += i;
        }
        for (int i = 5; i < n; i += 5) {
            if (i % 3 != 0) { // <-- already added if i is divisible by 3
                sum += i;
            }
        }
        return sum;
    }
}
