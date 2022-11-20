package JavaBasics.Conditions;

public class ConditionsExamples {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        int a = 10;
        int b = 20;

        System.out.println(a <= b); //True
        System.out.println(a >= b); //False
        System.out.println(a == b/2); //True
        System.out.println(a != b/2); //False

        String x = "Softuni";
        String y = "Softuni";

        // Case Sensitive; If uppercase then it must follow the uppercase
        System.out.println(x.equals(y));
    }
}
