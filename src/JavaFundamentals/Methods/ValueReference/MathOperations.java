package JavaFundamentals.Methods.ValueReference;

import java.util.Scanner;

public class MathOperations {
    public static int calculate(int x, char op, int y){
        int result = 0;
        if (op == '*'){
            result = x * y;
        } else if (op == '/'){
            result = x / y;
        } else if (op == '+'){
            result = x + y;
        } else if (op == '-'){
            result = x - y;
        }

        // If no result return, then it will have errors
        return result;
    }

    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        int result = calculate(Integer.parseInt(scanner.nextLine()), scanner.nextLine().charAt(0), Integer.parseInt(scanner.nextLine()));
        System.out.println(result);
    }
}
