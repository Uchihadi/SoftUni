package AdvancedConditions.Homework;

import java.util.Scanner;

public class PointRectangleBorder {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        if (x == x2 || x == x1 || y == y1 || y == y2){
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }
    }
}
