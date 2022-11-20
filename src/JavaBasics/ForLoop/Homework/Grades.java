package JavaBasics.ForLoop.Homework;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        double avg = 0;
        double gradeCount = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;

        for (int i = 0; i < n; i++){
            double grades = scanner.nextDouble();

            if (grades >= 2.00 & grades <= 2.99){
                count2++;
            } else if (grades >= 3.00 & grades <= 3.99){
                count3++;
            } else if (grades >= 4.00 & grades <= 4.99){
                count4++;
            } else if (grades >= 5.00){
                count5++;
            }

            gradeCount += grades;
        }
        avg = gradeCount / n;
        double totalCount = count2 + count3 + count4 + count5;
        double count2Percent = count2 / totalCount * 100;
        double count3Percent = count3 / totalCount * 100;
        double count4Percent = count4 / totalCount * 100;
        double count5Percent = count5 / totalCount * 100;

        System.out.printf("Top students: %.2f", count5Percent);
        System.out.print("%\n");
        System.out.printf("Between 4.00 and 4.99: %.2f", count4Percent);
        System.out.print("%\n");
        System.out.printf("Between 3.00 and 3.99: %.2f",count3Percent);
        System.out.print("%\n");
        System.out.printf("Fail: %.2f", count2Percent);
        System.out.print("%\n");
        System.out.printf("Average: %.2f", avg);
    }
}
