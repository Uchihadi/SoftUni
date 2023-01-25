package JavaObjectMapString.AssociativeArrays.StreamAPI;

import java.util.Arrays;
import java.util.Scanner;

public class FilteringCollections {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)) // Lambda Expression Input -> Expression
                .filter(num -> num >0) // Filter goes through the collection then only elements greater than 0
                .toArray();

        for (int num : nums) {
            System.out.println(num);
        }
    }
}
