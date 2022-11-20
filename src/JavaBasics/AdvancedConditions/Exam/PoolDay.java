package JavaBasics.AdvancedConditions.Exam;

import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {
        // Write code here
        Scanner scanner = new Scanner(System.in);
        int ppl = Integer.parseInt(scanner.nextLine());
        double feePerson = Double.parseDouble(scanner.nextLine());
        double priceSunbed = Double.parseDouble(scanner.nextLine());
        double priceUmbrella = Double.parseDouble(scanner.nextLine());

        double umbrellaNeeded = Math.ceil(ppl/2.0);
        double sunbedNeeded = Math.ceil(0.75*ppl);

        double entranceFee = ppl * feePerson;
        double umbrellaFee = umbrellaNeeded * priceUmbrella;
        double sunbedFee = sunbedNeeded * priceSunbed;
        double totalCost = entranceFee + umbrellaFee + sunbedFee;

        System.out.printf("%.2f euro", totalCost);
    }
}
