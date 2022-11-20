package DataTypes.Arrays.Homework;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);

        // Declaring the arrays through scanner with space split in between
        String [] arr1 = scanner.nextLine().split(" ");
        String [] arr2 = scanner.nextLine().split(" ");

        // Declaring variable list of element1 from arr2
        // Declaring variable list of element2 from arr2
        for (var element1: arr2) {
            for (var element2: arr1) {
                if(element1.equals(element2)){
                    System.out.print(element2 + " ");
                }
            }
        }
    }
}
