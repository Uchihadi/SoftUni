package JavaBasics.WhileLoop.Homework;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int steps = 0;

        while (!command.equals("Going home")){
            int steps1 = Integer.parseInt(command);
            steps += steps1;

            if (steps >= 10000) {
                break;
            }
            command = scanner.nextLine();
        }

        if (steps >= 10000){
            System.out.println("Goal reached! Good job!");
        } else {
            int steps3 = scanner.nextInt();
            int stepsLeft = 10000 - steps - steps3;
            System.out.printf("%d more steps to reach goal.", stepsLeft);
        }
    }
}
