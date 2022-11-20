package JavaBasics.Expressions;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        double vegCost = Double.parseDouble(scanner.nextLine());
        double fruitCost = Double.parseDouble(scanner.nextLine());
        int vegWeight = Integer.parseInt(scanner.nextLine());
        int fruitWeight = Integer.parseInt(scanner.nextLine());

        double costUSD = (vegCost*vegWeight) + (fruitCost*fruitWeight);
        double costEuro = costUSD * 0.89;

        System.out.printf("%.2f", costEuro);
    }
}
