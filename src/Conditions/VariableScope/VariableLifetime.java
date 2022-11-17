package Conditions.VariableScope;

import java.util.Scanner;

public class VariableLifetime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Today = scanner.nextLine();

        // If 1st Line == Monday, then it will follow through the simple If statement
        if (Today.equals("Monday")){
            double salary = scanner.nextDouble();
            System.out.println(salary);
        }
    }
}
