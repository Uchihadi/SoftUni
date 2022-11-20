package Arrays.Homework;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int[] arrayTwoZero = new int[array.length + 2];

        for (int i = 1, j = 0; i <= array.length; i++, j++){
            arrayTwoZero[i] = array[j];
        }

        arrayTwoZero [arrayTwoZero.length - 1] = 0;
        arrayTwoZero[0] = 0;

        int sumLeft = 0;
        int sumRight = 0;
        int index = -1;

        for (int i = 0; i < arrayTwoZero.length - 2; i++) {
            sumLeft += arrayTwoZero[i];
            sumRight = 0;
            for (int j = arrayTwoZero.length - 1; (j > 0 && (i + 1) < j); j--) {

                sumRight += arrayTwoZero[j];

                if (sumLeft == sumRight && j - i == 2) {
                    index = i;
                }
            }
        }
        if (index > -1) {
            System.out.println(index);
        } else if (index == -1) {
            System.out.println("no");
        }
    }
}
