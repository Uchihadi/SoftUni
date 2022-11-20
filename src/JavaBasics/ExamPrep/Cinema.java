package JavaBasics.ExamPrep;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();
        String offerType = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());

        if (movie.equals("John Wick")){
            if (offerType.equals("Drink")){
                double cost = tickets*12.0;
                System.out.printf("Your bill is %.2f$", cost);
            } else if (offerType.equals("Popcorn")){
                double cost = tickets*15.0;
                System.out.printf("Your bill is %.2f$", cost);
            } else if (offerType.equals("Menu")){
                double cost = tickets*19.0;
                System.out.printf("Your bill is %.2f$", cost);
            }
        } else if (movie.equals("Star Wars")) {
            if (tickets >= 4){
                if (offerType.equals("Drink")) {
                    double cost = tickets * 18.0 * 0.7;
                    System.out.printf("Your bill is %.2f$", cost);
                } else if (offerType.equals("Popcorn")) {
                    double cost = tickets * 25.0 * 0.7;
                    System.out.printf("Your bill is %.2f$", cost);
                } else if (offerType.equals("Menu")) {
                    double cost = tickets * 30.0 * 0.7;
                    System.out.printf("Your bill is %.2f$", cost);
                }
            } else {
                if (offerType.equals("Drink")) {
                    double cost = tickets * 18.0;
                    System.out.printf("Your bill is %.2f$", cost);
                } else if (offerType.equals("Popcorn")) {
                    double cost = tickets * 25.0;
                    System.out.printf("Your bill is %.2f$", cost);
                } else if (offerType.equals("Menu")) {
                    double cost = tickets * 30.0;
                    System.out.printf("Your bill is %.2f$", cost);
                }
            }
        } else if (movie.equals("Jumanji")) {
            if (tickets == 2) {
                if (offerType.equals("Drink")) {
                    double cost = tickets * 9.0 * 0.85;
                    System.out.printf("Your bill is %.2f$", cost);
                } else if (offerType.equals("Popcorn")) {
                    double cost = tickets * 11.0 * 0.85;
                    System.out.printf("Your bill is %.2f$", cost);
                } else if (offerType.equals("Menu")) {
                    double cost = tickets * 14.0 * 0.85;
                    System.out.printf("Your bill is %.2f$", cost);
                }
            } else {
                if (offerType.equals("Drink")) {
                    double cost = tickets * 9.0;
                    System.out.printf("Your bill is %.2f$", cost);
                } else if (offerType.equals("Popcorn")) {
                    double cost = tickets * 11.0;
                    System.out.printf("Your bill is %.2f$", cost);
                } else if (offerType.equals("Menu")) {
                    double cost = tickets * 14.0;
                    System.out.printf("Your bill is %.2f$", cost);
                }
            }
        }
    }
}
