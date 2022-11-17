package Conditions.Homework;

import java.util.Scanner;

public class AreaFigures {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        if (type.equals("square")) {
            double num = Double.parseDouble(scanner.nextLine());
            double area = num * num;
            System.out.printf("%.2f", area);
        } else if (type.equals("rectangle")) {
            double num1 = Double.parseDouble(scanner.nextLine());
            double num2 = Double.parseDouble(scanner.nextLine());
            double area = num1 * num2;
            System.out.printf("%.2f", area);
        } else if (type.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            double area = Math.PI * radius * radius;
            System.out.printf("%.2f", area);
        } else {
            System.out.println("Unknown figure");
        }
    }
}
