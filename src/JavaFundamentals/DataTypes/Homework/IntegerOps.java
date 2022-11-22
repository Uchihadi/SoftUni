package JavaFundamentals.DataTypes.Homework;

import java.util.Scanner;

public class IntegerOps {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        int fourth = scanner.nextInt();

        int maths = Math.abs((first + second) / third * fourth);

        System.out.println(maths);
    }
}
