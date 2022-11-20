package JavaBasics.ForLoop.Homework;

public class NumbersEnding7 {
    public static void main(String[] args) {
        // Write your code here
        for (int i = 0; i < 1000; i++){
            if (i % 10 == 7){
                System.out.print(i + " ");
            }
        }

    }
}
