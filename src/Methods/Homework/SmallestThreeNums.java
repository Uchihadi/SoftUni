package Methods.Homework;

import java.util.Scanner;

public class SmallestThreeNums {
    public static int smallNum(int a, int b, int c){
        int smallest = 0;

        if (a < b && a < c) {
            smallest = a;
        } else if (b < a && b < c) {
            smallest = b;
        } else if (c < a && c < b) {
            smallest = c;
        }
        return smallest;
    }

    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        System.out.println(smallNum(a, b, c));
    }
}
