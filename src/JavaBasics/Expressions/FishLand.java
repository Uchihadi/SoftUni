package JavaBasics.Expressions;

import java.util.Scanner;

public class FishLand {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        double mackerelperKg = Double.parseDouble(scanner.nextLine());
        double spratsperKg = Double.parseDouble(scanner.nextLine());
        double tunaKg = Double.parseDouble(scanner.nextLine());
        double scadsKg = Double.parseDouble(scanner.nextLine());
        int musselsKg = Integer.parseInt(scanner.nextLine());

        double tunaperKg = mackerelperKg*1.6;
        double scadsperKg = spratsperKg*1.8;
        double mussels = musselsKg*7.5;
        double tuna = tunaKg * tunaperKg;
        double scads = scadsKg * scadsperKg;
        double total = mussels + tuna + scads;

        System.out.printf("%.2f", total);
    }
}
