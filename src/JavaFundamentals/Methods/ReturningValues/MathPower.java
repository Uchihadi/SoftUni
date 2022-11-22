package JavaFundamentals.Methods.ReturningValues;

import java.math.BigDecimal;
import java.util.Scanner;

public class MathPower {
    // BigDecimal consists of a random precision integer unscaled value and a 32-bit integer scale.
    // x = base num; y = exponent
    public static BigDecimal power(BigDecimal x, int y) {
        // update the baseNumber with power
        x = x.pow(y);
        return x;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal result = power(new BigDecimal(scanner.nextLine()), Integer.parseInt(scanner.nextLine()));
        System.out.println(result);
    }
}