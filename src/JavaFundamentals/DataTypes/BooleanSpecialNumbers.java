package JavaFundamentals.DataTypes;

import java.util.Scanner;

public class BooleanSpecialNumbers {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int num = 1; num <= n; num++){
            int sumOfDigits = 0;
            int digits = num;

            while (digits > 0){
                sumOfDigits += digits % 10;
                digits = digits / 10;
            }


            if (sumOfDigits == 5 || sumOfDigits == 7 || sumOfDigits == 11){
                System.out.printf("%d -> True%n", sumOfDigits);
            } else {
                System.out.printf("%d -> False%n", sumOfDigits);
            }
        }
    }
}
