package JavaObjectMapString.AssociativeArrays;

import java.util.*;

public class CountRealNumbers {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        TreeMap <Integer, Integer> count = new TreeMap<>(); // Initialising Count of Keys on TreeMap
        for (int num:nums) {
            if (!count.containsKey(num)) {
                count.put(num, 0);
            }
            count.put(num, count.get(num) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()){
            System.out.printf("%d -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
