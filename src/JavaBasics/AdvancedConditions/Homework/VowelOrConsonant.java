package JavaBasics.AdvancedConditions.Homework;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.nextLine();

        if (letter.equals("a") || letter.equals("A") || letter.equals("e") || letter.equals("E") || letter.equals("i") || letter.equals("I") || letter.equals("o") || letter.equals("O") || letter.equals("u") || letter.equals("U")){
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
