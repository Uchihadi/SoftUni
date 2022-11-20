package JavaBasics.Expressions;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        int dogs = Integer.parseInt(scanner.nextLine());
        int other = Integer.parseInt(scanner.nextLine());

        double dogFood = dogs * 2.50;
        double otherFood = other * 4;
        double totalFood = dogFood + otherFood;

        System.out.printf("%.2f dollars", totalFood);
    }
}
