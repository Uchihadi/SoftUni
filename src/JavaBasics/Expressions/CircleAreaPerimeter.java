package JavaBasics.Expressions;

import java.util.Scanner;

public class CircleAreaPerimeter {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner (System.in);
        double R = Double.parseDouble(scanner.nextLine());

        double A = Math.PI * R * R;
        double P = 2 * Math.PI * R;

        System.out.printf("Area = %f\n", A);
        System.out.printf("Perimeter = %f\n", P);
    }
}
