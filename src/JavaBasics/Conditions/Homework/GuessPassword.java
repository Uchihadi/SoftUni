package JavaBasics.Conditions.Homework;

import java.util.Scanner;

public class GuessPassword {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        String pw = scanner.nextLine();

        if (pw.equals("s3cr3t!")) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
