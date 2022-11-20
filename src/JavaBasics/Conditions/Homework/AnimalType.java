package JavaBasics.Conditions.Homework;

import java.util.Scanner;

public class AnimalType {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        String animals = scanner.nextLine();

        if (animals.equals("dog")) {
            System.out.println("mammal");
        } else if (animals.equals("crocodile") || animals.equals("tortoise") || animals.equals("snake")){
            System.out.println("reptile");
        } else {
            System.out.println("unknown");
        }
    }
}
