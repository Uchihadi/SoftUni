package DataTypes.Homework;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        for(char i = 'a'; i < 'a' + num; i++){
            for (char j = 'a'; j < 'a' + num; j++){
                for (char k = 'a'; k < 'a' + num; k++){
                    System.out.print(i);
                    System.out.print(j);
                    System.out.print(k);
                    System.out.println();
                }
            }
        }
    }
}
