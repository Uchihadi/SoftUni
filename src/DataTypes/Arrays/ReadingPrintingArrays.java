package DataTypes.Arrays;

import java.util.Scanner;

public class ReadingPrintingArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int [] num = new int [n];
        for (int i = 0; i <n; i++){
            num[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }
    }
}
