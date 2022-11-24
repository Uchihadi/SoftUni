import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LargestPipeArea2 {
    static void largestArea(int n, int m,
                            int[] h, int[] v)
    {

        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for (int i = 1; i <= n + 1; i++)
            s1.add(i);

        for (int i = 1; i <= m + 1; i++)
            s2.add(i);

        for (int i = 0; i < h.length; i++) {

            s1.remove(h[i]);
        }

        for (int i = 0; i < v.length; i++) {

            s2.remove(v[i]);
        }

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

        Arrays.sort(list1);
        Arrays.sort(list2);

        int maxH = 0, p1 = 0, maxV = 0, p2 = 0;

        for (int j = 0; j < list1.length; j++) {
            maxH = Math.max(maxH, list1[j] - p1);
            p1 = list1[j];
        }

        for (int j = 0; j < list2.length; j++) {
            maxV = Math.max(maxV, list2[j] - p2);
            p2 = list2[j];
        }

        System.out.println(maxV * maxH);
    }

    public static void main(String[] args)
    {

        int n = 3, m = 3;
        int[] h = { 2 };
        int[] v = { 2 };
        largestArea(n, m, h, v);
    }
}
