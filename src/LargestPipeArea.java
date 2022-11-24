// Java program for the above approach

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class LargestPipeArea {

    // Function to find the largest area
    // when a series of horizontal &
    // vertical bars are removed
    static void largestArea(int n, int m,
                            int[] h, int[] v)
    {
        // Stores all bars
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        // Insert horizontal bars
        for (int i = 1; i <= n + 1; i++)
            s1.add(i);

        // Insert vertictal bars
        for (int i = 1; i <= m + 1; i++)
            s2.add(i);

        // Remove horizontal separators from s1
        for (int i = 0; i < h.length; i++) {

            s1.remove(h[i]);
        }

        // Remove vertical separators from s2
        for (int i = 0; i < v.length; i++) {

            s2.remove(v[i]);
        }

        // Stores left out horizontal and
        // vertical separators
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
        int n = 3, m = 3;

        // Given arrays
        int[] h = { 2 };
        int[] v = { 2 };

        // Function call to find the largest
        // area when a series of horizontal &
        // vertical bars are removed
        largestArea(n, m, h, v);
    }
}
