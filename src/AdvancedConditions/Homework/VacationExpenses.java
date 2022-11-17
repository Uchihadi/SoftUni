package AdvancedConditions.Homework;

import java.util.Scanner;

public class VacationExpenses {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        String accomodation = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        if (season.equals("Spring")){
            if (accomodation.equals("Hotel")){
                double cost = (days*30.0) * .8;
                System.out.printf("%.2f", cost);
            } else if (accomodation.equals("Camping")){
                double cost = (days*10.0) * .8;
                System.out.printf("%.2f", cost);
            }
        }

        if (season.equals("Summer")){
            if (accomodation.equals("Hotel")){
                double cost = (days*50.0);
                System.out.printf("%.2f", cost);
            } else if (accomodation.equals("Camping")){
                double cost = (days*30.0);
                System.out.printf("%.2f", cost);
            }
        }
        if (season.equals("Autumn")){
            if (accomodation.equals("Hotel")){
                double cost = (days*20.0) * .7;
                System.out.printf("%.2f", cost);
            } else if (accomodation.equals("Camping")){
                double cost = (days*15.0) * .7;
                System.out.printf("%.2f", cost);
            }
        }
        if (season.equals("Winter")){
            if (accomodation.equals("Hotel")){
                double cost = (days*40.0) * .9;
                System.out.printf("%.2f", cost);
            } else if (accomodation.equals("Camping")){
                double cost = (days*10.0) * .9;
                System.out.printf("%.2f", cost);
            }
        }

    }
}
