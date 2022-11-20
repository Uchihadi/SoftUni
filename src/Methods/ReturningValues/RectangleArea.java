package Methods.ReturningValues;

import java.util.Scanner;

public class RectangleArea {

    public static int calculateArea(int width, int height) {
        return width*height;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int area = calculateArea(Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()));
        System.out.println(area);
    }
}