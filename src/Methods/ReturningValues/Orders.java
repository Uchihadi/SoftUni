package Methods.ReturningValues;

import java.util.Scanner;

public class Orders {

    public static double products(String product){
        double price = 0;
        if (product.equals("coffee")){
            price = 1.5;
        } else if (product.equals("water")){
            price = 1.00;
        } else if (product.equals("coke")){
            price = 1.4;
        } else if (product.equals("snacks")){
            price = 2;
        }
        return price;
    }

    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        double priceProduct = products(scanner.nextLine());
        int qty = Integer.parseInt(scanner.nextLine());

        double cost = priceProduct * qty;
        System.out.printf("%.2f",cost);
    }
}
