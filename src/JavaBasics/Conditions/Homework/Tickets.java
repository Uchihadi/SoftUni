package JavaBasics.Conditions.Homework;

import java.util.Scanner;

public class Tickets {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        double studentPrice = 1.00;
        double regularPrice = 1.60;

        if (type.equals("student")){
            System.out.printf("$%.2f", studentPrice);
        } else if (type.equals("regular")){
            System.out.printf("$%.2f", regularPrice);
        } else {
            System.out.println("Invalid ticket type!");
        }
    }
}
