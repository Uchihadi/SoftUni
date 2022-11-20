package JavaBasics.AdvancedConditions.NestedLoops.Homework;

import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int firstNo = 1; firstNo <= n; firstNo += (n-1)){
            for (int secondNo = 1; secondNo <= n; secondNo += (n-1)){
                for (int thirdNo = 1; thirdNo <= n; thirdNo += (n-1)){
                    if (firstNo*secondNo*thirdNo / n == 1){
                        System.out.println(" " + firstNo + secondNo + thirdNo);
                    }
                }
            }
        }
        System.out.println();
    }
}
