package JavaBasics.WhileLoop.Homework;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Initialise Number
        int num = 0;

        while (n > 0){
            num = num + (n % 10);
            n = n/10;
        }
        System.out.println(num);

    }
}
