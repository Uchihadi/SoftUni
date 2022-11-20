package JavaBasics.ForLoop.Homework;

import java.util.Scanner;

public class Rollercoaster {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        int seats = scanner.nextInt();
        int minAge = scanner.nextInt();
        int people = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i < people; i++){
            int ageEach = scanner.nextInt();

            if (ageEach >= minAge){
                sum++;
            }

            if (sum == seats){
                break;
            }
        }
        if (sum == seats){
            System.out.println("The rollercoaster departures");
        } else {
            System.out.println("Waiting..");
        }
    }
}
