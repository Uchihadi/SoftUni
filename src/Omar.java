import java.util.Scanner;

public class Omar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String character = " ";

        for (int i = 1; i <= num; i++){
            character = scanner.nextLine();
            character += i;
        }

        System.out.print(" " + character);
    }
}
