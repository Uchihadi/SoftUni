package JavaFundamentals.Exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Scanner Array
        List<String> journal = Arrays.stream(scanner.nextLine().split(",\\s+"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Craft!")) {
            // Creates an Array as long command is not "Craft!"
            String[] commandArr = command.split(" - ");

            switch (commandArr[0]) {
                case "Collect":
                    String itemC = commandArr[1];
                    if (!journal.contains(itemC)){
                        journal.add(itemC);
                    }
                    break;
                case "Drop":
                    String itemD = commandArr[1];
                    if (journal.contains(itemD)){
                        journal.remove(itemD);
                    }
                    break;
                case "Renew":
                    String itemR = commandArr[1];
                    int lastI = journal.size() - 1;
                    if (journal.contains(itemR)){
                        journal.remove(itemR);
                        journal.add(lastI, itemR);
                    }
                    break;
                case "Combine Items":
                    String items = commandArr[1];
                    String[] itemsArray = items.split(":");
                    String oldItem = itemsArray[0];
                    String newItem = itemsArray[1];
                    int index = journal.indexOf(oldItem) + 1;
                    if (journal.contains(oldItem)){
                        journal.add(index, newItem);
                    }
                    break;
            }
            // At the end of the While Looping
            command = scanner.nextLine();
        }
        String fullJournal = journal.toString().replaceAll("[\\[\\]]", "");
        System.out.print(fullJournal);
    }
}
