package JavaFundamentals.Methods;

public class CreatingMethods {

    // Use meaningful names for method: 1) Noun/Adjective + Noun & 2) camelCase
    // Method Name describes the task in clear and non-ambiguous way
    // Creating the Method greetUser with parameter String name
    public static void greetUser(String name){
        System.out.println("Hello, " + name + "!");
    }

    // Invoking JavaFundamentals.Methods
    public static void main(String[] args) {
        // Hello John
        greetUser("John");
        // Hello Steve
        greetUser("Steve");
    }
}
