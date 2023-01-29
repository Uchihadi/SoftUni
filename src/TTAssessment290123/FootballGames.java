package TTAssessment290123;
import java.util.ArrayList;
import java.util.List;

public class FootballGames {
    public static List<Integer> solve(int n, List<List<Integer>> date) {
        int maxCount = 0;
        int dateWithMaxCount = 0;
        int maxDate = 0;
        for (int i = 0; i < n; i++) {
            int s = date.get(i).get(0);
            int t = date.get(i).get(1);
            maxDate = Math.max(maxDate, t);
        }
        int[] counts = new int[maxDate + 1];
        for (int i = 0; i < n; i++) {
            int s = date.get(i).get(0);
            int t = date.get(i).get(1);
            for (int j = s; j < t; j++) {
                counts[j]++;
                if (counts[j] > maxCount) {
                    maxCount = counts[j];
                    dateWithMaxCount = j;
                }
            }
        }
        List<Integer> result = new ArrayList<>();
        result.add(dateWithMaxCount);
        result.add(maxCount);
        return result;
    }
}
