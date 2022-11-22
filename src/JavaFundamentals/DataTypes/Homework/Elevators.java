package JavaFundamentals.DataTypes.Homework;

import java.util.Scanner;

public class Elevators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();

        int course = n / p;
        int course2 = n % p;

        if (course2 < p){
            course += 1;
        }

        System.out.println(course);
    }
}
