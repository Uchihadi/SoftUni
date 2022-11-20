package JavaBasics.AdvancedConditions.ForLoop.Homework;

import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sumDiv2 = 0, sumDiv3 = 0, sumDiv4 = 0;

        for (int i = 0; i < n; i++){
            int input = scanner.nextInt();

            if (input % 2 == 0) {
                sumDiv2++;
            }
            if (input % 3 == 0) {
                sumDiv3++;
            }
            if (input % 4 == 0) {
                sumDiv4++;
            }

        }
        double sumDiv2Percent = sumDiv2 * 100 / n;
        double sumDiv3Percent = sumDiv3 * 100 / n;
        double sumDiv4Percent = sumDiv4 * 100 / n;

        System.out.printf("%.2f", sumDiv2Percent);
        System.out.print("%\n");
        System.out.printf("%.2f", sumDiv3Percent);
        System.out.print("%\n");
        System.out.printf("%.2f", sumDiv4Percent);
        System.out.print("%\n");
    }
}
