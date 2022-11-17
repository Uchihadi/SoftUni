package AdvancedConditions.WhileLoop.Homework;

import java.util.Scanner;

public class SpecialBonus {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        int numInit = scanner.nextInt();
        int previousNum = numInit;

        while (true){
            int num = scanner.nextInt();
            if (num == numInit) {
                break;
            }
            previousNum = num;
        }
        System.out.println(previousNum*2);
    }
}
