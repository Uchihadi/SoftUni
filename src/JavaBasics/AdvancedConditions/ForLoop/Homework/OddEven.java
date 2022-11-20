package JavaBasics.AdvancedConditions.ForLoop.Homework;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double evenMaxNum = Double.MIN_VALUE;
        double oddMaxNum = Double.MIN_VALUE;
        double oddMinNum = Double.MAX_VALUE;
        double evenMinNum = Double.MAX_VALUE;
        double evenSum = 0;
        double oddSum = 0;

        for(int i = 0; i < n; i++){
            int num = scanner.nextInt();

            if (num % 2 == 0){
                evenSum += num;
            } else {
                oddSum += num;
            }

            if (num > evenMaxNum && num % 2 == 0){
                evenMaxNum = num;
            }

            if (num > oddMaxNum && num % 2 != 0){
                oddMaxNum = num;
            }

            if (num < evenMinNum && num % 2 == 0){
                evenMinNum = num;
            }

            if (num < oddMinNum && num % 2 != 0){
                oddMinNum = num;
            }
        }
        System.out.printf("OddSum=%.2f\n", oddSum);
        System.out.printf("OddMin=%.2f\n", oddMinNum);
        System.out.printf("OddMax=%.2f\n",evenMaxNum);
        System.out.printf("EvenSum=%.2f\n", evenSum);
        System.out.printf("EvenMin=%.2f\n", evenMinNum);
        System.out.printf("EvenMax=%.2f\n",oddMaxNum);
    }
}
