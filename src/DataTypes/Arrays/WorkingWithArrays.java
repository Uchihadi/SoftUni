package DataTypes.Arrays;

import java.util.Scanner;

public class WorkingWithArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array num
        int [] num = new int[10];

        // Array
        for (int i = 0; i < num.length; i++){
            num[i] = i + 1;
        }

        int sum = num[0] + num[9];
        System.out.println(sum);
    }
}
