package JavaObjectMapString.AssociativeArrays;
import java.util.HashMap;
import java.util.Map;

public class AssociativeArrays {
    public static void main(String[] args) {
        // Map <Key, Value> map = new HashMap<>();
//        Map <Key, Value> airplanes = new HashMap<>();
//        Map <Key, Value> shoppingList = new LinkedHashMap<>();
//        Map <Key, Value> phoneBook = new TreeMap<>();

        HashMap<String, Integer> airplanes = new HashMap<>();
        airplanes.put("Airbus A320", 150); // Adding records to the HashMaps
        airplanes.put("Boeing 737", 130);

        airplanes.remove("Airbus A320");

        System.out.println(airplanes.containsKey("Boeing 737")); // True
        System.out.println(airplanes.containsValue(130)); // True
        System.out.println();

        // Iteration and access to the hashmap keys %s with its values %d, HashMap Collections
        for (Map.Entry<String, Integer> entry : airplanes.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
