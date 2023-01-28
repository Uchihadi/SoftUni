package JavaObjectMapString.ObjectsClasses.BuiltInAPI;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" "); // Create an array
        Random random = new Random(); // Class Random with its object random
        // Java Random class is used to generate a stream of pseudorandom numbers

        for (int i = 0; i < words.length; i++) {
            int j = random.nextInt(words.length); // To Swap them in a random order
            String wordToSwap = words[i]; // The word in an ith position of the Array
            words[i] = words[j]; // Element index i = index j
            words[j] = wordToSwap; // Swap element index j to the object wordToSwap
        }

        System.out.println(String.join(System.lineSeparator(), words));
        // lineSeparator() method of Java System class returns line separator string which is system dependent
    }
}
