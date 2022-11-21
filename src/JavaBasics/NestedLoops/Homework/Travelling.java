package JavaBasics.NestedLoops.Homework;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            double budget = Double.parseDouble(scanner.nextLine());
            double savings = 0;

            while (savings < budget){
                savings += Double.parseDouble(scanner.nextLine());
            }

            System.out.println("Going to " + input + "!");
            input = scanner.nextLine();
        }
    }
}
