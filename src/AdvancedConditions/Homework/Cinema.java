package AdvancedConditions.Homework;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int seatsPerRow = Integer.parseInt(scanner.nextLine());

        if (type.equals("Premiere")){
            double cost = 12.00*rows*seatsPerRow;
            System.out.printf("%.2f", cost);
        } else if (type.equals("Normal")){
            double cost = 7.50*rows*seatsPerRow;
            System.out.printf("%.2f", cost);
        } else if (type.equals("Discount")){
            double cost = 5.00*rows*seatsPerRow;
            System.out.printf("%.2f", cost);
        }
    }
}
