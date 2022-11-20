package JavaBasics.Expressions;

import java.util.Scanner;

public class TownInfo {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        int population = Integer.parseInt(scanner.nextLine());
        int area = Integer.parseInt(scanner.nextLine());
        System.out.printf("Town %s has a population of %d and area %d square km.", town, population, area);
    }
}
