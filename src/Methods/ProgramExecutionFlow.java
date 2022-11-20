package Methods;
import java.util.Scanner;

// Program Flow in Java is controlled by the call stack memory
// Stack used to keep track of what methods are called & points of program where they are called
// As soon as method finish executing, program flows resumes executing following codes

public class ProgramExecutionFlow {
    public static void main(String[] args) {

        // 1) Scanner to accept user input
        Scanner sc = new Scanner(System.in);
        String city = sc.nextLine();

        // 2) We read the name city and then call the printWeather() method, passing in this string a parameter
        printWeather(city);

        // 4) Finally, this returns to where method is called, then print out the qns and prompting another input
        System.out.println("Check the weather in another location?");

        String choice = sc.nextLine();

        if (choice.equals("yes")) {
            // Do something
        }
        //Do something else

    }

    // 3) Program skips from printWeather() to here method to execute the code inside
    public static void printWeather(String city) {
        System.out.println(String.format("The weather in %s is:", city));
        System.out.println("Cloudy with a 53% chance of rain!");
    }

}
