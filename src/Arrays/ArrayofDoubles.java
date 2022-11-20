package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayofDoubles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] num = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(e -> Double.parseDouble(e))
                .toArray();

        for (int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }
    }
}
