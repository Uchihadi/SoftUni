package LeetCodeJava;

import java.lang.*;
import java.util.*;

public class HorizontalVerticalBars {
    static void largestArea(int N, int M, int[] H, int[] V)
    {
        // Stores all them bars
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        // Insert horizontal bars
        for (int i = 1; i <= N + 1; i++)
            s1.add(i);

        // Insert vertical bars
        for (int i = 1; i <= M + 1; i++)
            s2.add(i);

        // Remove horizontal separators from s1
        for (int i = 0; i < H.length; i++) {

            s1.remove(H[i]);
        }

        // Remove vertical separators from s2
        for (int i = 0; i < V.length; i++) {

            s2.remove(V[i]);
        }

        // Stores left out horizontal and vertical separators
        int[] list1 = new int[s1.size()];
        int[] list2 = new int[s2.size()];

        int i = 0;
        Iterator it1 = s1.iterator();
        while (it1.hasNext()) {
            list1[i++] = (int)it1.next();
        }

        i = 0;
        Iterator it2 = s2.iterator();
        while (it2.hasNext()) {
            list2[i++] = (int)it2.next();
        }

        // Sort both list in
        // ascending order
        Arrays.sort(list1);
        Arrays.sort(list2);

        int maxH = 0, p1 = 0, maxV = 0, p2 = 0;

        // Find maximum difference of neighbors of list1
        for (int j = 0; j < list1.length; j++) {
            maxH = Math.max(maxH, list1[j] - p1);
            p1 = list1[j];
        }

        // Find max difference of neighbors of list2
        for (int j = 0; j < list2.length; j++) {
            maxV = Math.max(maxV, list2[j] - p2);
            p2 = list2[j];
        }

        // Print largest volume
        System.out.println(maxV * maxH);
    }

    // Driver Code
    public static void main(String[] args)
    {
        // Given value of N & M
        int N = 3, M = 3;

        // Given arrays
        int[] H = { 2 };
        int[] V = { 2 };

        // Function call to find the largest
        // area when a series of horizontal &
        // vertical bars are removed
        largestArea(N, M, H, V);
    }
}
