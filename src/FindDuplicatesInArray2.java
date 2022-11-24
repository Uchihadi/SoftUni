// Java Program to find any duplicates in given Array
// No Duplicates, hence the sad face :(

import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesInArray2 {

    // Driver Program (STAY)
    public static void main(String[] args)
    {
        int arr[] = {12, 11, 49, 13, 4, 5, 6, 25, 21};
        int n = arr.length;
        printDuplicates(arr, n);
    }

    // Function to find and print duplicates (STAY)
    private static void printDuplicates(int[] arr, int n)
    {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        boolean dup = false;
        for (int i = 0; i < n; i++) {
            if(map.containsKey(arr[i])){
                count = map.get(arr[i]);
                map.put(arr[i], count + 1);
            }
            else {
                map.put (arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry: map.entrySet())
        {
            // If frequency > 1
            // Print element (MODIFY to SMILE)
            if (entry.getValue() > 1){
                //System.out.print(entry.getKey()+" ");
                System.out.print(":)");
                dup = true;
            }
        }

        // No duplicates present
        if(!dup){
            System.out.println(":(");
        }
        else {
            System.out.println(":)");
        }
    }
}
