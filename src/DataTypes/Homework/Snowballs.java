package DataTypes.Homework;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int highestValue = Integer.MIN_VALUE;
        int highestSnow = 0;
        int highestTime = 0;
        int highestQuality = 0;

        for (int i = 0; i < n; i++){
            int snow = Integer.parseInt(scanner.nextLine());
            int time = Integer.parseInt(scanner.nextLine());
            int quality = Integer.parseInt(scanner.nextLine());

            int value = (int) Math.pow((snow/time), quality);

            if (value > highestValue){
                highestSnow = snow;
                highestTime = time;
                highestQuality = quality;
                highestValue = value;
            }
        }
        System.out.printf("%d : %d = %d (%d)", highestSnow, highestTime, highestValue, highestQuality);
    }
}
