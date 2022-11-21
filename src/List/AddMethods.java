package List;

import java.util.ArrayList;
import java.util.List;

public class AddMethods {
    public static void main (String[] args){
        List<String> safetyEquipment = new ArrayList<>();

        safetyEquipment.add("Hazmat suit");
        safetyEquipment.add("Protective Gloves");

        for (String equipment : safetyEquipment) {
            System.out.println(equipment);
        }
    }
}
