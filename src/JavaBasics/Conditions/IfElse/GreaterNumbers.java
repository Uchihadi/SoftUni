package JavaBasics.Conditions.IfElse;

import java.util.Scanner;

public class GreaterNumbers {
    public static void main(String[] args) {
        // To find out which number is greater
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        if (num1 > num2) { //Remainder
            System.out.println("Greater number: " +num1);
        } else {
            System.out.println("Greater number: " +num2);
        }
    }
}
