package JavaFundamentals.Methods.Homework;

import java.util.Scanner;

public class PasswordValidator {

    // Boolean works for programmes that requires validation
    public static boolean characterValidator (String password){
        for (int i = 0; i <= password.length() - 1; i++) {
            // Characters of password eg. 1, 2, 3
            char currentSymbol = password.charAt(i);

            // Small Letters symbol numbers
            boolean smallLetter = currentSymbol >= 97 && currentSymbol <= 120;

            // Capital Letters numbers
            boolean capitalLetter = currentSymbol >= 65 && currentSymbol <= 90;

            // Digits numbers
            boolean digits = currentSymbol >= 48 && currentSymbol <= 57;

            if (!smallLetter && !capitalLetter && !digits){
                return false;
            }
        }
        return true;
    }

    public static boolean countValidator (String password) {
        // Starting the digit counting
        int digitCount = 0;

        // For each character in the password; If character is a digit then digit count ++
        for (int i = 0; i <= password.length() - 1; i++) {
            char currentSymbol = password.charAt(i);
            if (Character.isDigit(currentSymbol)) {
                digitCount++;
            }
        }

        //If there are more than 2 digits, return true
        if (digitCount >= 2){
            return true;
        } else {
            return false;
        }

    }

    public static boolean lengthValidator (String password) {
        if (password.length() >= 6 && password.length() <= 10){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        if (!lengthValidator(password)){
            System.out.println("Password must be between 6 and 10 characters");
        }

        if (!characterValidator(password)){
            System.out.println("Password must consist only of letters and digits");
        }

        if (!countValidator(password)){
            System.out.println("Password must have at least 2 digits");
        }

        if (lengthValidator(password) && countValidator(password) && characterValidator(password)){
            System.out.println("Password is valid");
        }
    }
}
