package JavaFundamentals.Methods.Homework;

import java.util.Scanner;

public class VowelsCount {
    public static void vowels(String word) {
        // Write your code here
        int vowels = 0;
        for (int i = 0; i < word.length(); i++){
            char letters = word.charAt(i);
            switch (letters) {
                case 97:
                case 101:
                case 105:
                case 111:
                case 117:
                case 65:
                case 69:
                case 'I':
                case 79:
                case 85:
                    vowels++;
                    break;
            }
        }

        System.out.println(vowels);
    }

    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        vowels(word);
    }
}
