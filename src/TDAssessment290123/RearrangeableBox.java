package TDAssessment290123;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RearrangeableBox {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextLine()) {
                int N = scanner.nextInt();
                int num = scanner.nextInt();
                int B = scanner.nextInt();
                int result = index_of_value(N, num, B);
                System.out.println(result);
            }
        } catch (Exception e) {
            System.out.println("An error occurred.");
        }
    }

    public static int index_of_value(int N, int num, int B) {
        ArrayList<Integer> odd = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();

        // Separate odd and even numbers
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                even.add(digit);
            } else {
                odd.add(digit);
            }
            num /= 10;
        }

        // Sort odd and even numbers
        Collections.sort(odd);
        Collections.sort(even, Collections.reverseOrder());

        // Combine sorted odd and even numbers
        ArrayList<Integer> box = new ArrayList<Integer>();
        box.addAll(odd);
        box.addAll(even);

        // Search for B in the box and return its index
        for (int i = 0; i < box.size(); i++) {
            if (box.get(i) == B) {
                return i + 1;
            }
        }
        return -1;
    }
}
