package JavaFundamentals.DataTypes;

import java.util.Scanner;

public class CenturiesToMinutes {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        int centuries = Integer.parseInt(scanner.nextLine());
        int years = centuries*100;
        int days = (int) (years * 365.2422);
        int hrs = days *24;
        int mins = hrs * 60;

        System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes", centuries, years, days, hrs, mins);
    }
}
