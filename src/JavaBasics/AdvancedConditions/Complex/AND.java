package JavaBasics.AdvancedConditions.Complex;

import java.util.Scanner;

public class AND {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        if (num <= 3 && num >= 0) {
            int num1 = num + 5;
            System.out.println(num1);
        } else if (num >= 4 && num <= 6){
            int num2 = num + 15;
            System.out.println(num2);
        } else if (num >= 7 && num <= 9){
            int num3 = num + 20;
            System.out.println(num3);
        }
    }
}
