package AdvancedConditions.SwitchCase;

import java.util.Scanner;

public class YesNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        // Another way of expressing if-else statements using switch-case
        // Any other input than "Y" or "N" --> Invalid Response
        switch (choice) {
            case "Y":
            case "Yes":
                System.out.println("Yes");
                break;
            case "N":
            case "No":
                System.out.println("No");
                break;
            default:
                System.out.println("Invalid Response");
                break;
        }
    }
}
