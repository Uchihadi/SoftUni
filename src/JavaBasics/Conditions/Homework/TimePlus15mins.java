package JavaBasics.Conditions.Homework;

import java.util.Scanner;

public class TimePlus15mins {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        int hrs = Integer.parseInt(scanner.nextLine());
        int mins1 = Integer.parseInt(scanner.nextLine());

        int mins2 = mins1 + 15;

        if (mins2 < 60){
            System.out.printf("%1d:%02d", hrs, mins2);
        } else {
            int mins3 = mins2 - 60;
            int hrs2 = hrs + 1;
            System.out.printf("%1d:%02d", hrs2, mins3);
        }

    }
}
