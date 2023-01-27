package JavaObjectMapString.ObjectsClasses;

import java.time.LocalDateTime;
import java.util.Random;

public class BuiltInAPI {
    public static void main(String[] args) {
        double result = Math.pow(2, 3);
        System.out.println(result);

        // Static Methods: Calling name of class and needed Method
        LocalDateTime today = LocalDateTime.now();
        double cosine = Math.cos(Math.PI);

        // Non-static Methods: Creates new instance of a new object of current class
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(10);

        // Example of built-in API class in Java
    }
}
