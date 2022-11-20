package Methods.ValueReference;

public class ReferenceType {

    // Type void as it is not going to return any results
    public static void increment(int[] numbersArray, int incrementValue) {
        // First Element in the number array then increment it
        numbersArray[0] += incrementValue;
    }

    public static void main(String[] args) {
        int[] num = {
                // Only one element inside it, basically just increment the first element of the Array
                // Returns only first element of the array
                5
        };
        increment(num, 15);
        System.out.println(num[0]);
    }
}
