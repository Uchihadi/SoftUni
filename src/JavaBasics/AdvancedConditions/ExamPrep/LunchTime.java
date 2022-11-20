package JavaBasics.AdvancedConditions.ExamPrep;

import java.util.Scanner;

public class LunchTime {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        String series = scanner.nextLine();
        int episodeDuration = Integer.parseInt(scanner.nextLine());
        int breakDuration = Integer.parseInt(scanner.nextLine());

        double lunch = 0.125 * breakDuration;
        double relax = 0.25 * breakDuration;
        double timeLeft = breakDuration - lunch - relax;

        if (timeLeft >= episodeDuration){
            double freeTime = Math.ceil(timeLeft - episodeDuration);
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", series, freeTime);
        } else {
            double moreTime = Math.ceil(episodeDuration - timeLeft);
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", series, moreTime);
        }
    }
}
