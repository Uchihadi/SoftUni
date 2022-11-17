package AdvancedConditions;

import java.util.Scanner;

public class NestedIfElse {
    public  static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        // Up to only 3 nested levels for more readable code
        if (num > 10) {
            if (num % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }else {
            System.out.println("Number is Invalid");
        }
    }
}
