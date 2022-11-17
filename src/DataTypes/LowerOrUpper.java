package DataTypes;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        char character = scanner.nextLine().charAt(0); //First Character of the Word

        if (Character.isUpperCase(character)){
            System.out.print("upper-case");
        } else {
            System.out.print("lower-case");
        }
    }
}
