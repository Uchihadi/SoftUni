package AdvancedConditions.Nested;

import java.util.Scanner;

public class BiggestNumberThree {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        if (num1 > num2){
            if (num1 > num3){
                System.out.println(num1);
            } else {
                System.out.println(num3);
            }
        } else if (num2 > num1) {
            if (num2 > num3){
                System.out.println(num2);
            }else{
                System.out.println(num3);
            }
        } else if (num3 > num2) {
            if (num3 > num1) {
                System.out.println(num3);
            } else {
                System.out.println(num1);
            }
        }
    }
}
