package Arrays.Homework;

import java.util.Scanner;

public class MaxSequenceEqualElements {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");
        int sequence = 0;
        int maxArr = 0;
        String index = "";

        for (int i = 0; i < numbers.length - 1; i++){
            if (numbers[i].equals(numbers[i+1])){
                sequence++;

                if (sequence > maxArr) {
                    maxArr = sequence;
                    index = numbers[i];
                }
            } else {
                sequence = 0;
            }
        }

        String[] newArr = new String[maxArr + 1];

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = index;
        }

        for (var element: newArr){
            System.out.print(element + " ");
        }
    }
}
