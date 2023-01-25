package JavaObjectMapString.AssociativeArrays.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortingCollections {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = new ArrayList<>();
        nums.add(13);
        nums.add(45);
        nums.add(22);

        List<Integer> ascending = nums.stream() // Creating an ascending ArrayList nums stream
                .sorted((n1, n2) -> n1.compareTo(n2))
                .collect(Collectors.toList()); // Collect and accumulate all elements into a new List

        for (Integer integer : ascending) {
            System.out.println(integer); // Printing out the integer in ascending order
        }

        List<Integer> descending = nums.stream() // Creating an descending ArrayList nums stream
                .sorted((n1, n2) -> n2.compareTo(n1))
                .collect(Collectors.toList()); // Collect and accumulate all elements into a new List

        System.out.println();
        for (Integer integer : descending) {
            System.out.println(integer); // Printing out the integer in descending order
        }
    }
}
