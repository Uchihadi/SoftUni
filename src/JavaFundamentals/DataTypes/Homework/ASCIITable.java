package JavaFundamentals.DataTypes.Homework;

import java.util.Scanner;

public class ASCIITable {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        int index = Integer.parseInt(scanner.nextLine());
        int index2 = Integer.parseInt(scanner.nextLine());

        for (int i = index; i <= index2; i++){
            System.out.print((char) i + " ");
        }
    }
}
