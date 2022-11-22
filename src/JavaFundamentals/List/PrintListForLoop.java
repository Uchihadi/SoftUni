package JavaFundamentals.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrintListForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numbers = new ArrayList<>(Arrays.asList(
                "one", "two", "three", "four", "five", "six"));

        // Each elements will be printed in new lines
        for (int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
        System.out.println();

        // Using for loop to print lines of numbers
        for (String number: numbers){
            System.out.println(number);
        }
        System.out.println();

        // Printing elements in one line, separated by a single space
        System.out.println(String.join(" ", numbers));

    }
}