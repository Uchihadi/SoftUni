package JavaBasics.AdvancedConditions.Homework;

import java.util.Scanner;

public class SortedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        if (num1 < num2){
            if (num2 < num3) {
                System.out.println("Ascending");
            } else {
                System.out.println("Not sorted");
            }
        }

        if (num1 > num2){
            if (num2 > num3) {
                System.out.println("Descending");
            } else {
                System.out.println("Not sorted");
            }
        }
    }
}
