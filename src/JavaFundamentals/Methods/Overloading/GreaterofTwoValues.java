package JavaFundamentals.Methods.Overloading;

import java.util.Scanner;

public class GreaterofTwoValues {

    // Void does not need return
    public static int getMax (int firstNum, int secondNum){
        if (firstNum > secondNum){
            return firstNum;
        }
        return secondNum;
    }

    public static char getMax (char firstChar, char secondChar){
        if (firstChar > secondChar){
            return firstChar;
        }
        return secondChar;
    }

    public static String getMax (String firstString, String secondString){
        int comparison = firstString.compareTo(secondString);
        if (comparison > 0){
            return firstString;
        }
        return secondString;
    }

    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.equals("int")){
            int higherNum = getMax(Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()));
            System.out.println(higherNum);
        } else if (input.equals("char")){
            char higherChar = getMax(scanner.nextLine().charAt(0), scanner.nextLine().charAt(0));
            System.out.println(higherChar);
        } else if (input.equals("string")){
            System.out.println(getMax(scanner.nextLine(), scanner.nextLine()));
        }
    }
}
