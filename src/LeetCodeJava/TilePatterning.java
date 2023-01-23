package LeetCodeJava;

public class TilePatterning {
    public int numTilePossibilities (String tiles) {
        int[] count = new int[26]; // Creating an array of letters from A to Z
        for (char c : tiles.toCharArray()) { // For-Each Loop that iterates through each character
            count[c - 'A']++; // toCharArray to convert Strings into Array of Characters
        } // Iterates using the ':' Operator
        return dfs(count);
    }

    private static int dfs(int[] arr) { // Function DFS takes Array as Inputs, where each element of arrays represents number of occurrences
        int sum = 0; // Sum Count starts from 0
        for (int i = 0; i < 26; i++) { // Generates all possible permutations of letters
            if (arr[i] == 0) {
                continue; // If Array is 0, it will break out of the loop
            }
            sum++; // Increments a Counter Variable 'sum' by one for each letter in the Array
            arr[i]--; // Decrements the value to show that one instance of letter has been used
            sum += dfs(arr); // Recursively calls function DFS with updated array, generates all possible permutations of remaining letters in Array
            arr[i]++; // Increments value of current element, restores the Original State of Array. Continues to Next Element in the Array
        }
        return sum; // Final value of sum is returned as Output of the Function
    }
}
