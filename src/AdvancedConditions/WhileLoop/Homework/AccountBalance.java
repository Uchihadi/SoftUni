package AdvancedConditions.WhileLoop.Homework;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        double balance = 0;

        while (true){
            String command = scanner.nextLine();
            if (command.equals("END")){
                break;
            }
            double money = Double.parseDouble(command);
            balance+= money;

            if (money >= 0) {
                System.out.printf("Increase: %.2f\n", money);
            } else {
                System.out.printf("Decrease: %.2f\n", money);
            }
        }
        System.out.printf("Total: %.2f", balance);
    }
}
