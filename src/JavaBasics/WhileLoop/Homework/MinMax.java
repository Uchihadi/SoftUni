package JavaBasics.WhileLoop.Homework;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        String command = scanner.nextLine();

        while (!command.equals("END")) {

            // int num will take over the scanner command
            int num = Integer.parseInt(command);
            if (num > maxNum) {
                maxNum = num;
            }

            if (num < minNum) {
                minNum = num;
            }

            // If no END then it will just loop back
            command = scanner.nextLine();
        }

        System.out.println("Max number: " +maxNum);
        System.out.println("Min number: " +minNum);
    }
}
