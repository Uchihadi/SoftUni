package AdvancedConditions.ForLoop;

import java.util.Scanner;

public class NumbersEnding7 {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 7; i < n; i = i+10) {
            System.out.println(i);
        }
    }
}
