package Methods.Parameters;

import java.util.Scanner;

public class PrintingTriangle {
    public static void printLine(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        // Add new line
        System.out.println();
    }

    public static void printTriangle(int n) {
        // Incrementing Lines
        for (int line = 1; line <= n; line++) {
            printLine(1, line);
        }

        // Decrementing Lines
        for (int line = n - 1; line >= 1; line--) {
            printLine(1, line);
        }
    }

    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        printTriangle(Integer.parseInt(scanner.nextLine()));
    }
}
