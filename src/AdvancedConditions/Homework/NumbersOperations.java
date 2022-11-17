package AdvancedConditions.Homework;

import java.util.Scanner;

public class NumbersOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        if (operator.equals("+")){
            int num = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + num);
        }

        if (operator.equals("-")){
            int num = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + num);
        }

        if (operator.equals("/")){
            int num = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + num);
        }

        if (operator.equals("%")){
            int num = num1 % num2;
            System.out.println(num1 + " % " + num2 + " = " + num);
        }

        if (operator.equals("*")){
            int num = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + num);
        }
    }
}
