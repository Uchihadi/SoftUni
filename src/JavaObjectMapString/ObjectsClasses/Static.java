package JavaObjectMapString.ObjectsClasses;

public class Static {
    public static void main(String[] args) {
        int a = Math.abs(5);
        int b = Math.abs(-10);
        System.out.println(a);
        System.out.println(b);

        double ceil = Math.ceil(8.357);
        System.out.println(ceil);

        double floor = Math.floor(8.357);
        System.out.println(floor);

        int max = Math.max(5, 10);
        System.out.println(max);

        int min = Math.min(5, 10);
        System.out.println(min);

        double roundedDown = Math.round(29.459);
        System.out.println(roundedDown);

        double roundedUp = Math.round(29.549);
        System.out.println(roundedUp);

        double roundedUpAgain = Math.round(29.5);
        System.out.println(roundedUpAgain);

        double number = Math.pow(3,2);
        System.out.println(number);

        double number1 = Math.sqrt(9);
        System.out.println(number1);

        double degrees = Math.toDegrees(3.141592653589793);
        System.out.println(degrees);

        double radians = Math.toRadians(180);
        System.out.println(radians);
    }
}