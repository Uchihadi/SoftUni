package AdvancedConditions.Exam;

import java.util.Scanner;

public class FootballTournament {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        String team = scanner.nextLine();
        int games = Integer.parseInt(scanner.nextLine());
        int points = 0;
        int wins = 0;
        int draws = 0;
        int lose = 0;

        for (int i = 0; i < games; i++){
            String result = scanner.nextLine();

            if (result.equals("W")){
                points += 3;
                wins += 1;
            } else if (result.equals("D")){
                points += 1;
                draws += 1;
            } else if (result.equals("L")){
                lose += 1;
            }

        }
        double winRate = (wins * 100)/games;

        System.out.printf("%s has won %d points this season.\n", team, points);
        System.out.println("Total stats:");
        System.out.printf("## W: %d\n", wins);
        System.out.printf("## D: %d\n", draws);
        System.out.printf("## L: %d\n", lose);
        System.out.printf("Win rate: %.2f", winRate);
        System.out.println("%");
    }
}
