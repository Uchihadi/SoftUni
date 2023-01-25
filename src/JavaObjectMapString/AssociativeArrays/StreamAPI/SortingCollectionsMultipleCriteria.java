package JavaObjectMapString.AssociativeArrays.StreamAPI;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SortingCollectionsMultipleCriteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, String> products = new HashMap<>();
        products.put(3, "banana");
        products.put(2, "apple");
        products.put(1, "banana");

        products.entrySet() // Method used to create a set of same elements in HashMap, returns a set view of Hash Map
                .stream().sorted((e1, e2) -> {
                    int firstComparison = e2.getValue().compareTo(e1.getValue()); // If both strings same, compareTo returns a 0
                    if (firstComparison == 0) {
                        return e1.getKey().compareTo(e2.getKey()); // Compare the keys, if values are same
                    }
                    return firstComparison;
                }).forEach(e -> System.out.println((e.getKey() + " " + e.getValue())));
    }
}
