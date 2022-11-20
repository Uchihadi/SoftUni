package JavaBasics.AdvancedConditions.WhileLoop;

import java.util.Scanner;

public class NumberProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String math = scanner.nextLine();

        // Loop every command as long as the command is not END
        while (!math.equals("END")){

            // After first input of num, then include case of input "Add" or "Subtract"
            // The Input Loop while continue so long input is not END
            switch (math) {
                case "Add":
                    num += 1;
                    break; // Break operator used to prematurely exit the Loop
                // When break executed, the code in the loop after IS SKIPPED (Subtract case is skipped)
                case "Subtract":
                    num--;
                    break;
            }

            // If input is placed "END", it will bypass the while loop and this line will execute to stop while loop
            math = scanner.nextLine();
        }
        // Prints out the final number after exiting while loop
        System.out.println(num);
    }
}
