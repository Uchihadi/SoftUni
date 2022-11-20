package JavaBasics.AdvancedConditions.WhileLoop.Homework;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int ml = 0;
        int plate = 0;
        int bowl = 0;

        while (!command.equals("End")){
            int bottles = Integer.parseInt(command);
            int ml1 = scanner.nextInt();
            int bottleMl = bottles * 750;

            ml += ml1;

            plate += 3;
            bowl++;

            if (ml > bottleMl){
                System.out.println("Not enough detergent");
                break;
            }

            command = scanner.nextLine();
        }

            System.out.println(plate);
            System.out.println(bowl);
        }

    }
