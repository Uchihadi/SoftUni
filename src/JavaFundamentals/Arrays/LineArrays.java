package JavaFundamentals.Arrays;

import java.util.Scanner;

public class LineArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String values = scanner.nextLine();
        String [] items = values.split(" ");
        int [] num = new int[items.length];

        for (int i = 0; i < items.length; i++) {
            num[i] = Integer.parseInt(items[i]);
        }

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
