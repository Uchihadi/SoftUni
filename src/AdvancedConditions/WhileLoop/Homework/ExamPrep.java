package AdvancedConditions.WhileLoop.Homework;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ExamPrep {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        int limitGrades = scanner.nextInt();
        int problemNo = 0;
        int gradesTotal = 0;

        while (true) {
            String problem = scanner.nextLine();
            problemNo++;

            if (problem.equals("Enough")){
                break;
            } else {
                int grades = parseInt(scanner.nextLine());
                gradesTotal += grades;
            }

        }
        System.out.printf("Total: %d", problemNo);
    }
}
