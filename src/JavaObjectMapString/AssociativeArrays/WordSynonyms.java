package JavaObjectMapString.AssociativeArrays;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()); // How many inputs of synonyms you would like
        LinkedHashMap<String, List<String>> words = new LinkedHashMap<>(); // LinkedHashMaps are for unique values

        for(int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            words.putIfAbsent(word, new ArrayList<>()); // Creates a new ArrayList key for a word that is absent
            words.get(word).add(synonym); // Adding synonym inside an ArrayList
        }

        for (Map.Entry<String, List<String>> entry : words.entrySet()){
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }
    }
}
