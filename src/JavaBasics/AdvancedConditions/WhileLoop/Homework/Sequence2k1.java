package JavaBasics.AdvancedConditions.WhileLoop.Homework;

import java.util.Scanner;

public class Sequence2k1 {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = 0;

        while (n > 0) {
            num = num*2+1;
            if (num > n){
                break;
            }
            System.out.println(num);
        }
    }
}
