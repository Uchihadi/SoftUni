package JavaBasics.AdvancedConditions.Homework;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());

        if (city.equals("London")){
            if (sales <= 500 & sales >= 0) {
                double comm = sales * 0.05;
                System.out.printf("%.2f", comm);
            } else if (sales <= 1000 & sales > 500) {
                double comm = sales * 0.07;
                System.out.printf("%.2f", comm);
            } else if (sales <= 10000 & sales > 1000) {
                double comm = sales * 0.08;
                System.out.printf("%.2f", comm);
            } else if (sales > 10000) {
                double comm = sales * 0.12;
                System.out.printf("%.2f", comm);
            }
        } else if (city.equals("New York")) {
            if (sales <= 500 & sales >= 0) {
                double comm = sales * 0.045;
                System.out.printf("%.2f", comm);
            } else if (sales <= 1000 & sales > 500) {
                double comm = sales * 0.075;
                System.out.printf("%.2f", comm);
            } else if (sales <= 10000 & sales > 1000) {
                double comm = sales * 0.1;
                System.out.printf("%.2f", comm);
            } else if (sales > 10000) {
                double comm = sales * 0.13;
                System.out.printf("%.2f", comm);
            }
        } else if (city.equals("Sydney")) {
            if (sales <= 500 & sales >= 0) {
                double comm = sales * 0.055;
                System.out.printf("%.2f", comm);
            } else if (sales <= 1000 & sales > 500) {
                double comm = sales * 0.08;
                System.out.printf("%.2f", comm);
            } else if (sales <= 10000 & sales > 1000) {
                double comm = sales * 0.12;
                System.out.printf("%.2f", comm);
            } else if (sales > 10000) {
                double comm = sales * 0.145;
                System.out.printf("%.2f", comm);
            }
        } else {
            System.out.println("error");
        }
    }
}
