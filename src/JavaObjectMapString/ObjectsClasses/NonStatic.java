package JavaObjectMapString.ObjectsClasses;

import java.util.Random;

public class NonStatic {
    public static void main(String[] args) {
        Random random = new Random();

        int numOne = random.nextInt(10);
        System.out.println(numOne);

        int numTwo = random.nextInt(10);
        System.out.println(numTwo);

        int number = random.nextInt();
        System.out.println(number);

        double num1 = random.nextDouble();
        System.out.println(num1);

        double num2 = random.nextDouble();
        System.out.println(num2);

        boolean isValid = random.nextBoolean();
        System.out.println(isValid);
    }
}
