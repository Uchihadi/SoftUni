package JavaObjectMapString.AssociativeArrays.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ConvertCollectionToArrayList {
    public static void main(String[] args) {
        // Write in your code
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(e -> Integer.parseInt(e)) // Maps each input string to Integers
                .collect(Collectors.toList()); // Converts Int Array to Int List

        for (Integer num : numbers) { // For each number within the numbers List
            System.out.println(num);
        }
    }
}
