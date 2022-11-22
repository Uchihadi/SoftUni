package JavaFundamentals.DataTypes.Homework;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        int currentYield = Integer.parseInt(scanner.nextLine());

        int day = 0;
        int extracted = 0;

        while (true){
            day++;
            extracted += currentYield-26;
            currentYield -= 10;

            if (currentYield < 100){
                break;
            }
        }
        extracted -= 26;
        System.out.println(day);
        System.out.println(extracted);
    }
}
