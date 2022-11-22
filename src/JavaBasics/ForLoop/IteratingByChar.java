package JavaBasics.ForLoop;

import java.util.Scanner;

public class IteratingByChar {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        char start = scanner.nextLine().charAt(0); //only the first letter from this start
        char end = scanner.nextLine().charAt(0); //only the first letter from this end

        for (char ch = start; ch <= end; ch++){
            // Character --> System.out.print (To print out in JavaFundamentals.Arrays)
            System.out.print(ch + " ");
        }
    }
}
