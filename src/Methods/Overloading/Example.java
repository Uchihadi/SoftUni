package Methods.Overloading;

import java.util.Scanner;

public class Example {

    // Integer Methods can only return Integers!
    public static int add (int x, int y) {
        return x + y;
    }

    public static int add (int x, int y, int z) {
        return x + y;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(add(3, 3));
        System.out.println(add(3, 3, 9));
    }

    public static void print(String text) {
        System.out.println(text);
    }

}
