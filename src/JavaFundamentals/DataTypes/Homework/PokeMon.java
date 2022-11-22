package JavaFundamentals.DataTypes.Homework;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()); // Poke Power
        int m = Integer.parseInt(scanner.nextLine()); // Poke Targets
        int y = Integer.parseInt(scanner.nextLine()); // Exhaustion Factor
        int target = 0;
        int initialN = n;

        while (true) {
            n -= m;
            target++;

            if (n < m) {
                break;
            }

            if (n == 0.5*initialN){
                n = n/y;
            }
        }
        System.out.println(n);
        System.out.println(target);
    }
}
