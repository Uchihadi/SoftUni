package JavaFundamentals.Methods.ReturningValues;

import java.util.Scanner;

public class ReturnValues {

    public static int getMax (int a, int b){
        if (a > b){
            //return is initiated, execution method will then stop
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = getMax(Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()));
        System.out.println(result);
    }
}