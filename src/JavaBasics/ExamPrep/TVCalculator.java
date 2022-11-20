package JavaBasics.ExamPrep;

import java.util.Scanner;

public class TVCalculator {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        int seasons = Integer.parseInt(scanner.nextLine());
        int episodes = Integer.parseInt(scanner.nextLine());
        double duration = Double.parseDouble(scanner.nextLine());

        double episodeSpecial = seasons * 10;
        double episodeDuration = duration*1.2*episodes;
        double totalDuration = Math.round(episodeDuration*seasons + episodeSpecial);

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", title, totalDuration);
    }
}
