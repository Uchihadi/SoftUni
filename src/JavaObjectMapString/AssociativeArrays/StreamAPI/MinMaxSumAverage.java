package JavaObjectMapString.AssociativeArrays.StreamAPI;

import java.util.*;
import java.util.List;

public class MinMaxSumAverage {
    public static void main(String[] args) {
        // Finding the min through Stream API
        List<Integer> numbers = new ArrayList<>() {{
            add(15);
            add(25);
            add(35);
        }};
        int min = numbers.stream()
                .mapToInt(n -> n.intValue())
                .min()
                .getAsInt();

        System.out.println(min);

        List<Integer> numbers1 = new ArrayList<>() {{
            add(15);
            add(25);
            add(35);
        }};
        int min1 = numbers.stream()
                .min((n1, n2) -> n1.compareTo(n2))
                .get();
        System.out.println(min1);

        // Finding the max through Stream API
        List<Integer> numbers2 = new ArrayList<>() {{
            add(15); add(25); add(35);
        }};
        int max = numbers.stream()
                .mapToInt(n -> n.intValue())
                .max()
                .getAsInt();
        System.out.println(max);

        List<Integer> numbers3 = new ArrayList<>() {{
            add(15); add(25); add(35);
        }};
        int max1 = numbers.stream()
                .max((n1, n2) -> n1.compareTo(n2))
                .get();
        System.out.println(max1);

        // Collection and mapping methods
//        Scanner scanner = new Scanner(System.in);
//        int[] numbers4 = Arrays.stream(scanner.nextLine()
//                        .split(" "))
//                .mapToInt(e -> Integer.parseInt(e))
//                .toArray();

        String[] words = {"abc", "def", "geh", "yyy"};
        words = Arrays.stream(words)
                .map(w -> w + "yyy")
                .toArray(String[]::new);
        for (String word : words) {
            System.out.println(word);
        }
    }
}
