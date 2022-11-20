package JavaBasics.Conditions.Homework;

import java.util.Scanner;

public class SpeedInfo {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        double speed = Double.parseDouble(scanner.nextLine());

        if (speed <= 30) {
            System.out.println("Slow");
        } else {
            System.out.println("Fast");
        }
    }
}
