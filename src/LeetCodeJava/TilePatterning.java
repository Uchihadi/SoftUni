package LeetCodeJava;

public class TilePatterning {
    public int numTilePossibilities (String tiles) {
        int[] count = new int[26]; // Creating an array of letters from A to Z
        for (char c : tiles.toCharArray()) { // For-Each Loop that iterates through each character
            count[c - 'A']++; // toCharArray to convert Strings into Array of Characters
        } // Iterates using the ':' Operator
        return dfs(count);
    }

    private static int dfs(int[] arr) {
        int sum = 0;
        for (int i = 0; i < 26; i++) {
            if (arr[i] == 0) {
                continue;
            }
            sum++;
            arr[i]--;
            sum += dfs(arr);
            arr[i]++;
        }
        return sum;
    }
}
