package List;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
    public static void main(String[] args){
        // write down your code; Parentheses should be empty
        List<Integer> numbers = new ArrayList<>();
        // Adding the numbers to the Number List
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
