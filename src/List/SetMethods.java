package List;

// add(element) - adds an element to the end of the list
// add(index, element) - adds an element at the specified index
// remove(element) - removes the element if found and returns a boolean value
// remove(index) - removes the element at the specified index
// size() - returns the number of elements
// contains(element) - checks if the list contains a certain element and returns a boolean value
// set(index, item) - replaces the element at the given index

import java.util.ArrayList;
import java.util.List;

public class SetMethods {
    public static void main(String[] args) {
        // Write your code here
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Andy");
        names.add("George");

        // Returns False
        boolean Exist = names.contains("Mark");
        System.out.println(Exist);

        // Returns True
        names.set((2), "Mark");
        Exist = names.contains("Mark");
        System.out.println(Exist);
    }
}
