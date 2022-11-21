package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PrintingLists {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // Creates a List that stores items using the toList function
        List<String> items = Arrays.stream(input.split(" "))
                .collect(Collectors.toList());

        // Create new List for numbers!
        List<Integer> numbers = new ArrayList<>();

        // Adding on to the new List numbers from the items.get function
        for (int i = 0; i < items.size(); i++){
            numbers.add(Integer.parseInt(items.get(i)));
        }

        // Prints out each individual numbers from the ArrayList
        for (Integer number : numbers) {
           System.out.println(number);
        }

    }
}
