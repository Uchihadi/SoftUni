package AdvancedConditions.Homework;

import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        String fruitVeg = scanner.nextLine();

        if (fruitVeg.equals("banana") || fruitVeg.equals("apple") || fruitVeg.equals("kiwi") || fruitVeg.equals("cherry") || fruitVeg.equals("lemon") || fruitVeg.equals("grapes")){
            System.out.println("fruit");
        } else if (fruitVeg.equals("cucumber") || fruitVeg.equals("pepper") || fruitVeg.equals("carrot") || fruitVeg.equals("onion")) {
            System.out.println("vegetable");
        }
    }
}
