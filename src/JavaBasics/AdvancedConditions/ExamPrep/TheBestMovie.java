package JavaBasics.AdvancedConditions.ExamPrep;

import java.util.Scanner;

public class TheBestMovie {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int maxSum = Integer.MIN_VALUE;
        int movieCount = 0;
        String bestMovie = "";

        while (!input.equals("STOP")){
            int currentSum = 0;
            movieCount++;
            for (int i = 0; i < input.length(); i++){
                int currentChar = input.charAt(i);
                currentSum += currentChar;
                if (currentChar >= 65 && currentChar <= 90){
                    currentSum -= input.length();
                } else if (currentChar >= 97 && currentChar <= 122) {
                    currentSum -= input.length() * 2;
                }
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
                bestMovie = input;
            }
            if (movieCount >= 7){
                break;
            }
            input = scanner.nextLine();
        }
        if (movieCount >= 7){
            System.out.println("The limit is reached.");
        }

        System.out.printf("The best movie for you is %s with %d ASCII sum.", bestMovie, maxSum);
    }
}
