package JavaBasics.AdvancedConditions.Homework;

import java.util.Scanner;

public class BiggestofFiveNumbers {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        int num4 = Integer.parseInt(scanner.nextLine());
        int num5 = Integer.parseInt(scanner.nextLine());

        if (num1 > num2 || num1>num3 || num1>num4 || num1>num5){
            System.out.println(num1);
        } else if (num2 > num1 || num2>num3 || num2>num4 || num2>num5){
            System.out.println(num2);
        } else if (num3 > num1 || num3>num2 || num3>num4 || num3>num5){
            System.out.println(num3);
        }else if (num4 > num1 || num4>num2 || num4>num3 || num4>num5){
            System.out.println(num4);
        }else if (num5 > num1 || num5>num2 || num5>num3 || num5>num4){
            System.out.println(num5);
        }
    }
}
