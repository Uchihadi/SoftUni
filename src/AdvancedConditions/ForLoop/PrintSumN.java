package AdvancedConditions.ForLoop;

import java.util.Scanner;

public class PrintSumN {
    public static void main(String[] args) {
        //Prefix Decrement: Decrease/Increase then print
        int a = 3;
        System.out.println(--a);
        System.out.println(++a);
        System.out.println(a);

        //Postfix Decrement: Print then Decrease/Increase
        int b = 3;
        System.out.println(b--);
        System.out.println(b++);
        System.out.println(b);

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // Initialise variable j that is supposed to be sum
        int j = 0;

        for (int i = 1; i <= n; i++){
            System.out.println(i);
            j += i;
        }
        System.out.println(j);
    }
}
