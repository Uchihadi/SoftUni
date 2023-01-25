package JavaObjectMapString.AssociativeArrays.StreamAPI;
import java.util.*;

public class FunctionalForEach {
    public static void main(String[] args) {
        Map<String, List<Integer>> courseGrades = new HashMap<>();
        courseGrades.put("Mathematics", new ArrayList<>() {{
            add(5);
            add(6);
            add(6);
        }});

        courseGrades.put("English", new ArrayList<>() {{
            add(4);
            add(6);
        }});

        courseGrades.put("History", new ArrayList<>() {{
            add(4);
            add(4);
            add(5);
            add(6);
            add(5);
        }});

        courseGrades.put("Biology", new ArrayList<>() {{
            add(6);
            add(5);
            add(4);
            add(6);
        }});

        courseGrades.entrySet()
                .stream()
                .sorted((a, b) -> {
                    if (a.getKey().compareTo(b.getKey()) == 0) {
                        int sumFirst = a.getValue().stream().mapToInt(x -> x).sum();
                        int sumSecond = b.getValue().stream().mapToInt(x -> x).sum();
                        return sumFirst - sumSecond;
                    }
                    return b.getKey().compareTo(a.getKey());
                })
                .forEach(pair -> {
                    System.out.println("Course: " + pair.getKey());
                    System.out.print("Grades: ");
                    pair.getValue().sort((a, b) -> a.compareTo(b));
                    for (int num : pair.getValue()) {
                        System.out.printf("%d ", num);
                    }
                    System.out.println();
                });
    }
}
