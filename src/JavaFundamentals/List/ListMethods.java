package JavaFundamentals.List;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
    public static void main(String[] args){
        // write down your code; Parentheses should be empty
        List<Integer> numbers = new ArrayList<>();
        // Adding the numbers to the Number JavaFundamentals.List
        numbers.add(50);
        numbers.add(0, 5);
        numbers.add(20);

        // To remove elements
        numbers.remove(0);
        numbers.remove(Integer.valueOf(20));

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}

// add(element) - adds an element to the end of the list
// add(index, element) - adds an element at the specified index
// remove(element) - removes the element if found and returns a boolean value
// remove(index) - removes the element at the specified index
// size() - returns the number of elements
// contains(element) - checks if the list contains a certain element and returns a boolean value
// set(index, item) - replaces the element at the given index
