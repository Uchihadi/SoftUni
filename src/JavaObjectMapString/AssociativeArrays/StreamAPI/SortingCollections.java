package JavaObjectMapString.AssociativeArrays.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortingCollections {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = new ArrayList<>();
        nums.add(13);
        nums.add(45);
        nums.add(22);

        List<Integer> ascending = nums.stream()
                .sorted()((n1, n2) -> n1.compareTo(n2))

    }
}
