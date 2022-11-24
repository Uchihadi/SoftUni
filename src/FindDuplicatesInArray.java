// You are given an array of length N;
// First line --> N (1 <= N <= 100); Next line --> N numbers (Numbers of 1st Array)
// Your task is to check if:
// 1) The array has at least one repeated element in it
// 2) Print happy if there is at least one repeated number [A Smile :)]

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicatesInArray {

    // Driver Program (STAY)
    public static void main(String[] args){
        int arr[] = {12, 11, 49, 12, 4, 5, 5, 22, 21};
        int n = arr.length;
        printDuplicates(arr, n);
    }

    // Function to find and print duplicates (STAY)
    private static void printDuplicates(int[] arr, int n)
    {
        Map <Integer, Integer> map = new HashMap<>();
        int count = 0;
        boolean dup = false;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                count = map.get(arr[i]);
                map.put(arr[i], count + 1);
            }
            else {
                map.put (arr[i], 1);
            }
        }

        for (Entry <Integer, Integer> entry: map.entrySet())
        {
            // If frequency > 1
            // Print element (MODIFY to SMILE)
            if (entry.getValue() > 1){
                System.out.print(entry.getKey()+" ");
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
