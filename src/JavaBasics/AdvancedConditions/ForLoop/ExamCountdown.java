package JavaBasics.AdvancedConditions.ForLoop;

import java.util.Scanner;

public class ExamCountdown {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        int currentDay = Integer.parseInt(scanner.nextLine());
        int j = currentDay;

        for (int i = currentDay; i >= 1; i--){
            System.out.println(i + " days before the exam");
            j -= i; //sum of all j
        }
        System.out.println("The exam has come");
    }
}
