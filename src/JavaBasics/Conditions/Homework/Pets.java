package JavaBasics.Conditions.Homework;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int food = Integer.parseInt(scanner.nextLine());
        double dogDay = Double.parseDouble(scanner.nextLine());
        double catDay = Double.parseDouble(scanner.nextLine());
        double turtleDay = Double.parseDouble(scanner.nextLine());

        double dogNeeds = days * dogDay;
        double catNeeds = days * catDay;
        double turtleNeeds = days * (turtleDay / 1000);
        double totalFood = dogNeeds + catNeeds + turtleNeeds;

        // Math.floor returns largest/equal integer that is less than value given
        // Math.ceil returns smallest integer greater than the value we pass
        if (food < totalFood) {
            double foodNeed = Math.ceil(totalFood - food);
            System.out.printf("%.0f more kilos of food are needed.", foodNeed);
        } else {
            double foodMore = Math.floor(food - totalFood);
            System.out.printf("%.0f kilos of food left.", foodMore);
        }
    }
}
