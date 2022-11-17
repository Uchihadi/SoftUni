package Expressions;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        double sqm = Double.parseDouble(scanner.nextLine());

        double sqmPrice = 7.61*sqm;
        double discount = sqmPrice*0.18;
        double discountPrice = sqmPrice - discount;

        System.out.printf("The final price is: %.2f dollars\n", discountPrice);
        System.out.printf("The discount is: %.2f dollars", discount);
    }

}
