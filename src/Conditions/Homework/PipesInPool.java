package Conditions.Homework;

import java.text.NumberFormat;
import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vol = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double hrs = Double.parseDouble(scanner.nextLine());

        NumberFormat percentFormat = NumberFormat.getPercentInstance();
        percentFormat.setMinimumFractionDigits(2);

        double flow = Math.floor((p1 + p2)*hrs);
        double flowpercentage = flow / vol;

        double p1percentage = p1*hrs / flow;
        double p2percentage = p2*hrs / flow;

        if (flow < vol) {
            System.out.print("The pool is " + percentFormat.format(flowpercentage) + " full. Pipe 1: " +percentFormat.format(p1percentage)+ ". Pipe 2: " +percentFormat.format(p2percentage)+ ".");
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hrs, flow);
        }
    }
}
