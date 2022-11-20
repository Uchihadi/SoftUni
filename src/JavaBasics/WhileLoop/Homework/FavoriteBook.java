package JavaBasics.WhileLoop.Homework;

import java.util.Scanner;

public class FavoriteBook {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);

        // First Input
        String favBook = scanner.nextLine();

        // Initialisation
        int num = 1;

        while (true) {
            String book = scanner.nextLine();
            if (book.equals(favBook)){
                System.out.println("Book found! Attempts: " + num);
                break;
            }

            num += 1;
        }
    }
}
