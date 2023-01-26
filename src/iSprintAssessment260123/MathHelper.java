package iSprintAssessment260123;

// Create a function to get the sum of all positive numbers less than N that are multiples of 3 or 5
// N is ranging from 1 to 100000 (inclusive)
// Class: MathHelper
// Method: getSumOfMultiple3or5 (int N)

public class MathHelper {
    public static int getSumOfMultiple3or5 (int N){
        int sum = 0;
        for (int i = 0; i < N; i++){
            if (i % 3 == 0 || i % 5 == 0) {
                sum +=i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(MathHelper.getSumOfMultiple3or5 (10)); // Output: 23
        System.out.println(MathHelper.getSumOfMultiple3or5 (14)); // Output: 45
    }
}

