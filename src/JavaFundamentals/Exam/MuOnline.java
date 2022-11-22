package JavaFundamentals.Exam;

import java.util.Scanner;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        // Create Array
        String[] inputArr = input.split("\\|");
        int baseHealth = 100;
        int baseBitcoins = 0;
        int bestRoom = 0;

        for (int i = 0; i <= inputArr.length - 1; i++){
            String room = inputArr[i];
            String[] roomArr = room.split("\\s+");
            String commandVsMonster = roomArr[0];

            if (commandVsMonster.equals("potion")){
                int healthAmt = Integer.parseInt(roomArr[1]);
                baseHealth += healthAmt;

                if (baseHealth <= 100){
                    System.out.printf("%d health points restored.%n", healthAmt);
                    System.out.printf("Current health: %d hp.%n", baseHealth);
                } else {
                    int healthBefore = baseHealth - healthAmt;
                    int newAmt = 100 - healthBefore;
                    baseHealth = 100;
                    System.out.printf("%d health points restored.%n", newAmt);
                    System.out.printf("Current health: %d hp.%n", baseHealth);
                }
            } else if (commandVsMonster.equals("chest")) {
                int bitcoinsAmt = Integer.parseInt(roomArr[1]);
                int newBitcoins = baseBitcoins + bitcoinsAmt;
                baseBitcoins = newBitcoins;
                System.out.printf("You found %d bitcoins.%n", bitcoinsAmt);
            } else {
                int damage = Integer.parseInt(roomArr[1]);
                baseHealth -= damage;

                if (baseHealth > 0){
                    System.out.printf("You have slayed a %s.%n", commandVsMonster);
                } else {
                    System.out.printf("You died! Killed by %s.%n", commandVsMonster);
                    bestRoom = i + 1;
                    break;
                }
            }
        }

        if (bestRoom > 0) {
            System.out.printf("Best room: %s%n", bestRoom);
        } else {
            System.out.printf("You've made it!%n");
            System.out.printf("Bitcoins: %d%n", baseBitcoins);
            System.out.printf("Health: %d%n", baseHealth);
        }
    }
}
