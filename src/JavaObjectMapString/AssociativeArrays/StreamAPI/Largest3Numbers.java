package JavaObjectMapString.AssociativeArrays.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(e -> Integer.parseInt(e))
                .sorted((n1, n2) -> n2.compareTo(n1)) // Descending Order
                .limit(3) // Limiting to the biggest 3 numbers avail
                .collect(Collectors.toList()); // Adding biggest 3 nums to the new Collectors List

        for (Integer number : numbers) { // Number is inside an Array of Numbers
            System.out.print(number + " "); // Printing out an Array
        }
    }
}
