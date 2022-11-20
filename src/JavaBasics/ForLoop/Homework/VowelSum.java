package JavaBasics.ForLoop.Homework;

import java.util.Scanner;

public class VowelSum {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        for(int i = 0; i <= n; i++){
            String character = scanner.nextLine();

            if (character.equals("a")){
                sum += 1;
            }
            if (character.equals("e")){
                sum += 2;
            }
            if (character.equals("i")){
                sum += 3;
            }
            if (character.equals("o")){
                sum += 4;
            }
            if (character.equals("u")){
                sum += 5;
            }
        }
        System.out.println(sum);
    }
}
