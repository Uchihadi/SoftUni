package Methods.Parameters;

import java.util.Scanner;

public class Calculations {

    // Declare each methods for additional and subtraction
    public static void add (int x, int y){
       System.out.println(x + y);
    }

    public static void multiply (int x, int y){
        System.out.println(x * y);
    }

    public static void subtract (int x, int y){
        System.out.println(x - y);
    }

    public static void divide (int x, int y){
        System.out.println(x / y);
    }

    // Print the following console
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        String cal = scanner.nextLine();
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        if (cal.equals("add")){
            add(x, y);
        } else if (cal.equals("multiply")) {
            multiply(x, y);
        } else if (cal.equals("subtract")) {
            subtract(x, y);
        } else if (cal.equals("divide")) {
            divide(x, y);
        }
    }
}
