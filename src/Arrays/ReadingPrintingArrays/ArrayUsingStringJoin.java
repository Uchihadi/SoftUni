package Arrays.ReadingPrintingArrays;

import java.util.Scanner;

public class ArrayUsingStringJoin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = {"one", "two"};
        System.out.println(String.join(", ", strings));
    }
}
