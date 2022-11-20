package JavaBasics.AdvancedConditions.ForLoop.Homework;

import java.util.Scanner;

public class ZigZagSum {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        for(int i = 1; i <= n; i++){
            int num = scanner.nextInt();

            if (num % 2 == 0){
                sum += num;
            } else {
                sum -= num;
            }
        }
        System.out.println(sum);
    }
}
