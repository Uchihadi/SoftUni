package DataTypes.Homework;

import java.util.Iterator;
import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double biggerVol = Double.MIN_VALUE;
        String biggerModel = "";

        for (int i = 0; i < n; i++){
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            double vol = Math.PI * radius * radius * height;

            if (vol > biggerVol) {
                biggerVol = vol;
                biggerModel = model;
            }
        }
        System.out.println(biggerModel);
    }
}
