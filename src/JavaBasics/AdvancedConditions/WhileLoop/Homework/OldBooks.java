package JavaBasics.AdvancedConditions.WhileLoop.Homework;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        String book = scanner.nextLine();
        int num = scanner.nextInt();

        int bookCount = 0;

        while (true){
            String newBook = scanner.nextLine();

            if (bookCount >= num){
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.", bookCount);
                break;
            } else if (newBook.equals(book)) {
                bookCount--;
                System.out.printf("You checked %d books and found it.", bookCount);
                break;
            }

            bookCount++;
        }
    }
}
