package DataTypes;

import java.util.Scanner;

public class NameConcatenation {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        String delimiter = scanner.nextLine();
        System.out.print(firstName + delimiter + lastName);
    }
}
