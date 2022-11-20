package JavaBasics.AdvancedConditions.WhileLoop.Homework;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double totalGrades = 0;
        int years = 0;

        while (years < 12) {
            double grades = scanner.nextDouble();
            totalGrades += grades;
            years++;
        }
        double avgGrades = totalGrades / years;

        if (avgGrades >= 4.00){
            System.out.printf("%s graduated. Average grade: %.2f", name, avgGrades);
        }
    }

}
