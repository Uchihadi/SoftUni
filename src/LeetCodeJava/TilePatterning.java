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
        int sum = 0; 
        for (int i = 0; i < 26; i++) { // Generates all possible permutations of letters
            if (arr[i] == 0) {
                continue;
            }
            sum++; // Increments a Counter Variable 'sum' by one
            arr[i]--;
            sum += dfs(arr);
            arr[i]++;
        }
        return sum; // Final value of sum is returned as Output of the Function
    }
}
