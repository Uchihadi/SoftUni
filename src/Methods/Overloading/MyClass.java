package Methods.Overloading;

public class MyClass {
    static int addTwoNumbers(int x, int y) {
        return x + y;
    }

    // Signatures: Combination of the method's names and parameters
    // Overloading a method is done by using the same name for multiple methods with different signatures (method name and parameters).
    // Instead of defining two methods that should do the same thing, it is better to create additional method overloads.
    // In the example below, we overload the addTwoNumbers method to work with both int and double:

    static double addTwoNumbers(double x, double y) {
        return x + y;
    }

    public static void print(String text) {
        System.out.println(text);
    }
}
