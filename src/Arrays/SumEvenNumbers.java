package Arrays;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String [] items = input.split(" ");
        int [] num = new int[items.length];

        int result = 0;

        for (int i = 0; i < num.length; i++){
            num [i] = Integer.parseInt(items[i]);
        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0){
                result += num[i];
            }
        }

        System.out.println(result);
    }
}
