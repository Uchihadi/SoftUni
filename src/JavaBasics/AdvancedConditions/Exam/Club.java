package JavaBasics.AdvancedConditions.Exam;

import java.util.Scanner;

public class Club {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        double profit = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        double income = 0;

        while (!command.equals("Party!")){

            String cocktail = command;
            int price = cocktail.length();
            int order = Integer.parseInt(scanner.nextLine());
            double priceOrder = price * order;
            if (priceOrder % 2 != 0) priceOrder *= .75;
            income += priceOrder;

            if (income >= profit){
                System.out.println("Target acquired.");
                break;
            }
            command = scanner.nextLine();
            if (command.equals("Party!")) {
                profit -= income;
                System.out.printf("We need %.2f dollars more.\n", profit);
                break;
            }
        }
        System.out.printf("Club income - %.2f dollars.", income);
    }
}
