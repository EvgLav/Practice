package sprint_1.listAndHashTable.addInHashTable;

import java.util.LinkedHashMap;

public class Praktikum {
    public static void main(String[] args) {
        // System.out.println(stateHolidays)
        //Январь - 1, 7
        //Февраль - 23
        //Март - 8
        //Май - 1, 9
        //Июнь - 12
        //Ноябрь - 4

        String jan = "1, 7";
        String may = "1, 9";

        // HashMap - порядок элементов в коллекции на основании хэш-кода
        //LinkedHashMap - хранит эл-ты в порядке добавления

        LinkedHashMap<String, String> stateHolidays = new LinkedHashMap<>();
        stateHolidays.put("Январь ", jan);
        stateHolidays.put("Февраль ", "23");
        stateHolidays.put("Март ", "8");
        stateHolidays.put("Май ", may);
        stateHolidays.put("Июнь ", "12");
        stateHolidays.put("Ноябрь ", "4");
        System.out.println(stateHolidays);

    }
}




















