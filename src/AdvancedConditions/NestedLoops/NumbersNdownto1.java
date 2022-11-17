package AdvancedConditions.NestedLoops;

import java.util.Scanner;

public class NumbersNdownto1 {
    public static void main(String[] args){
        // Write Your Code Here
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = n; i > 0; i--){
            System.out.print(i + " ");
        }
    }
}

