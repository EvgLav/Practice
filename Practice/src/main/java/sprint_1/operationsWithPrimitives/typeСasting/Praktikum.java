package sprint_1.operationsWithPrimitives.typeСasting;

public class Praktikum {
    public static void main(String[] args) {
        int roubles = 5000; // сумма на счету
        short yearRate = 4; // годовая процентная ставка
        int numOfMonth = 36; // количество месяцев, на который открыт вклад
        int monthRefill = 1000; // ежемесячное пополнение


        double monthlyRate = yearRate / 12.0 / 100;

        for (int i = 0; i < numOfMonth; i++) {
            //начисление процентов на текущую сумму вклада
            roubles += roubles * monthlyRate;
            //Добавление месячного пополнения
            roubles += monthRefill;

        }
        System.out.println("Через " + numOfMonth + " месяцев накопится " + roubles + " рублей");

        if ( roubles >= 41_000) { // определите, удалось ли достичь цели
            System.out.println("Ура! Можно идти в магазин за новым объективом!");
        } else {
            System.out.println("Нужно ещё немного подкопить.");
        }
    }
}