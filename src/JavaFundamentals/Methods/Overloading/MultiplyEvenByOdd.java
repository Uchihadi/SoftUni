package JavaFundamentals.Methods.Overloading;

import java.util.Scanner;

public class MultiplyEvenByOdd {
    // Create a sum Even Method
    public static int sumEven (String value){
        int sumEven = 0;
        for (int i = 0; i < value.length(); i++) {

            // Concatenating the string value into char value; i = index
            if (value.charAt(i) != '-'){
                int digit = Integer.parseInt(value.charAt(i) + "");
                if (digit % 2 == 0) {
                    sumEven += digit;
                }
            }
        }
        return sumEven;
    }

    public static int sumOdd (String value){
        int sumOdd = 0;

        // For loop initial value = 0; For loop to function while i is less than value length
        for (int i = 0; i < value.length(); i++) {

            // Concatenating the string value into char value
            if (value.charAt(i) != '-'){
                // Concatenate with empty string
                int digit = Integer.parseInt(value.charAt(i) + "");
                if (digit % 2 != 0) {
                    sumOdd += digit;
                }
            }
        }
        return sumOdd;
    }

    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        int even = sumEven(num);
        int odd = sumOdd(num);
        System.out.println(even * odd);

    }
}
