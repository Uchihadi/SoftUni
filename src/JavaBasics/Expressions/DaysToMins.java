package JavaBasics.Expressions;

import java.util.Scanner;

public class DaysToMins {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner (System.in);
        double mins = Double.parseDouble(scanner.nextLine());

        double hrs = mins * 60;
        double days = hrs * 24;

        System.out.printf("%.0f\n", days);
    }
}
