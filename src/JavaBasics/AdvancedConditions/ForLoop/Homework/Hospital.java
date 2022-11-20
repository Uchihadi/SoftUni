package JavaBasics.AdvancedConditions.ForLoop.Homework;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int doctorCount = 7;
        int treatedPatients = 0;
        int untreatedPatients = 0;

        for (int i = 1; i <= days; i++){
            int patients = scanner.nextInt();

            if (i % 3 == 0){
                doctorCount++;
            }

            if (patients > doctorCount){
                patients -= doctorCount;
                untreatedPatients += patients;
                treatedPatients += doctorCount;
            } else {
                treatedPatients += patients;
            }
        }
        System.out.printf("Treated patients: %d.\n", treatedPatients);
        System.out.printf("Untreated patients: %d.\n", untreatedPatients);
    }
}
