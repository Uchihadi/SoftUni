package JavaBasics.ExamPrep;

import java.util.Scanner;

public class CinemaIncome {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        int capacity = Integer.parseInt(scanner.nextLine());

        // Initialise Profit Margins
        int profit = 0;

        // A command to break the While Looping; if input does not follow the while loop then it will go to while loop
        String input = scanner.nextLine();

        while (!input.equals("Movie time!")){

            // Input the people number entering the cinema
            int people = Integer.parseInt(input);
            if (capacity - people >= 0){

                // Capacity will minus the people
                capacity -= people;

                // $5 Profit will be added from each of the People
                profit += people*5;

                // If the current people can be divided by 3, then profit minus $5
                if (people % 3 == 0){
                    profit -= 5;
                }
            } else {
                System.out.println("This cinema is full.");
                break;
            }

            // Enters the next group of people
            input = scanner.nextLine();
        }

        if ("Movie time!".equals(input)){
            System.out.printf("There are %d seats left in the cinema.\n", capacity);
        }

        System.out.printf("Cinema income - %d$", profit);
    }
}
