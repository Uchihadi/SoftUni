package TTAssessment290123;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TreasureMining {
    private static int maxValue = 0;
    private static List<List<Integer>> map;
    private static int rows, columns;
    private static HashSet<String> visited = new HashSet<>();

    public static int getMaxValue(List<List<Integer>> treasureValues) {
        map = treasureValues;
        rows = map.size();
        columns = map.get(0).size();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (map.get(i).get(j) > 0) {
                    dfs(i, j, 0);
                }
            }
        }
        return maxValue;
    }

    private static void dfs(int i, int j, int value) {
        visited.add(i + "," + j);
        value += map.get(i).get(j);
        maxValue = Math.max(maxValue, value);
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        for (int[] direction : directions) {
            int newI = i + direction[0];
            int newJ = j + direction[1];
            if (newI >= 0 && newI < rows && newJ >= 0 && newJ < columns
                    && map.get(newI).get(newJ) > 0 && !visited.contains(newI + "," + newJ)) {
                dfs(newI, newJ, value);
            }
        }
        visited.remove(i + "," + j);
    }
}
