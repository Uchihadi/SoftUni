package Methods.Homework;

import java.util.Scanner;

public class CharactersInRange {
    private static void printResult (char symbol1, char symbol2) {
        if (symbol2 < symbol1) {
            for (int i = symbol2 + 1; i < symbol1; i++){
                System.out.print((char) i + " ");
            }
        } else {
            for (int i = symbol1 + 1; i < symbol2; i++){
                System.out.print((char) i + " ");
            }
        }
    }

    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        char symbol1 = scanner.nextLine().charAt(0);
        char symbol2 = scanner.nextLine().charAt(0);

        printResult(symbol1, symbol2);
    }
}
