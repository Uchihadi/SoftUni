package AdvancedConditions.Homework;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        int balance = Integer.parseInt(scanner.nextLine());
        int withdraw = Integer.parseInt(scanner.nextLine());
        int limit = Integer.parseInt(scanner.nextLine());

        if (withdraw < limit){
            if (withdraw < balance){
                System.out.println("The withdraw was successful.");
            } else {
                System.out.println("Insufficient availability.");
            }
        } else {
            if (withdraw > balance) {
                System.out.println("Insufficient availability.");
            }
            System.out.println("The daily limit was exceeded.");
        }
    }
}
