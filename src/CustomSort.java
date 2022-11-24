import java.util.*;

public class CustomSort {

    public static void main(String[] args) {
        int[] array = { 3,1,2,2,4 };
        customSort(array);
        int[] arr1 = { 8,5,5,5,5,1,1,1,4,4 };
        customSort(arr1);
    }

    static void customSort(int[] array) {
        Map<Integer, Integer> map = new HashMap();
        List<Integer> numbers = new ArrayList();

        for (int i : array) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }

            if (!numbers.contains(i)) {
                numbers.add(i);
            }
        }

        Collections.sort(numbers);

        List<Integer> returning = new ArrayList(numbers);
        int count = 1;
        while (!returning.isEmpty()) {
            returning = print(returning, map, count);
            count++;
        }
    }

    static List<Integer> print(List<Integer> numbers, Map<Integer, Integer> map, int howManyItems) {
        List<Integer> returning = new ArrayList();

        for (Integer num : numbers) {
            if (map.get(num) == howManyItems) {
                for (int i = 1; i <= howManyItems; i++) {
                    System.out.println(num);
                }
            } else {
                returning.add(num);
            }
        }
        return returning;
    }
}