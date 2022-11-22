package JavaFundamentals.Arrays.ReadingPrintingArrays;

import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] stringFirst = scanner.nextLine().split(" ");
        int[] numFirst = new int[stringFirst.length];

        String[] stringSecond = scanner.nextLine().split(" ");
        int[] numSecond = new int[stringSecond.length];

        int sumFirst = 0;

        for (int i = 0; i < stringFirst.length; i++) {
            numFirst[i] = Integer.parseInt(stringFirst[i]);
            numSecond[i] = Integer.parseInt(stringSecond[i]);

            if (numFirst[i] != numSecond[i]){
                System.out.printf("JavaFundamentals.Arrays are not identical. Found difference at %d index.", i);
                return;
            }

            sumFirst += numFirst[i];
        }

        System.out.printf("JavaFundamentals.Arrays are identical. Sum %d", sumFirst);
    }
}
