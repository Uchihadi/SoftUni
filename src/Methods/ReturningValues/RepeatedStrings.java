package Methods.ReturningValues;

import java.util.Scanner;

public class RepeatedStrings {

    public static void repeat(String string, int repeat) {
        for (int i = 1; i <= repeat; i++) {
            System.out.print(string);
        }
    }

    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        repeat(scanner.nextLine(), Integer.parseInt(scanner.nextLine()));
    }
}
