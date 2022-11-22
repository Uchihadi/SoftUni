package JavaFundamentals.Methods.Parameters;

public class Method {
    public static void printStudent(String name, int age, double grade) {
        System.out.printf("Student: %s; Age: %d, Grade: %.2f\n",
                name, age, grade);
    }
    public static void printName(String firstName) {
        System.out.println(firstName + " Refsnes");
    }

    public static void main(String[] args) {
        printStudent("Steve", 23, 5.70);
        printName("Liam");
        printName("Jenny");
        printName("Anja");
    }
}
