package JavaObjectMapString.ObjectsClasses.BuiltInAPI;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" "); // Create an array
        Random random = new Random(); // Class Random with its object random

        for (int i = 0; i < words.length; i++) {
            int j = random.nextInt(words.length);
            String wordToSwap = words[i]; // The word in an ith position of the Array
            words[i] = words[j]; // Element index i = index j
            words[j] = wordToSwap; // Swap element index j to the object wordToSwap
        }

        System.out.println(String.join(System.lineSeparator(), words));
    }
}
