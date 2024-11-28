package sprint_1.operationsWithPrimitives.orderOfLogicalOperations;

public class Praktikum {
    public static void main(String[] args) {
        Hamster[] hamsters = new Hamster[]{
                new Hamster("Пушок", 150.5, 2, "Белый", true, false),
                new Hamster("Корочка", 120, 3, "Рыжий", false, false),
                new Hamster("Шалун", 199.9, 4, "Чёрный", false, false),
                new Hamster("Снежинка", 175.9, 4, "Рыжий", false, false),
                new Hamster("Штучка", 199.9, 7, "Чёрный", true, true),
                new Hamster("Баранка", 173.8, 5, "Рыже-белый", true, false),
                // Добавьте Ниндзю
                new Hamster("Ниндзя", 168, 3, "Рыже-белый", true, false)
        };

        System.out.println("В конкурсе «Рыжий хомяк года» смогут участвовать:");
        for (int i = 0; i < hamsters.length; i++) {
            Hamster hamster = hamsters[i];

            // Составьте условие отбора с помощью дополнительных переменных
            boolean isColor = true;
            boolean isWeight = true;
            boolean isAge = true;

                //Проверка цвета
                if (hamster.color.equals("Рыжий")) {
                    isColor = true;
                } else if (hamster.isFluffy) {
                    if (hamster.color.equals("Рыже-белый")) {
                        isColor = true;
                    } else {
                        isColor = false;
                    }
                } else {
                    isColor = false;
                }


                //Проверка веса
                if (hamster.weight >= 150 && hamster.weight <= 200) {
                    isWeight = true;
                } else if (hamster.isFluffy) {
                    isWeight = true;
                } else {
                    isWeight = false;
                }

                //Проверка возраста
                if (hamster.age >= 2) {
                    isAge = true;
                } else {
                    isAge = false;
                }


                if (isColor && isWeight && isAge && !(hamsters[i].isWinner)) {
                    System.out.println(" - " + hamster.name);
                }
            }
        }
    }


