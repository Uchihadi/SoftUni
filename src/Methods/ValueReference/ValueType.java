package Methods.ValueReference;

public class ValueType {
    public static void incrementNumber(int num, int incrementValue) {
        num += incrementValue;
    }

    public static void main(String[] args) {
        int num = 5;
        incrementNumber(num, 15);
        System.out.println(num);
    }

}
