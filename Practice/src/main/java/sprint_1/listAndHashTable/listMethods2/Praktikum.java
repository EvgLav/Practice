package sprint_1.listAndHashTable.listMethods2;

import java.util.ArrayList;
import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Шиншилла");
        animals.add("Крокодил");
        animals.add("Лев");
        animals.add("Медведь");
        animals.add("Слон");

        while (true) {
            printMenu();
            int command = scanner.nextInt();
            if (command == 1) {
                System.out.println("Сейчас в зоопарке можно увидеть " + animals.size() + " животных:");
                for (int i = 0; i < animals.size(); i++) {
                    System.out.println(animals.get(i)); // Напечатайте животных
                }
            } else if (command == 2) {
                System.out.println("Какое животное хотите добавить?");
                String animal = scanner.next();
                animals.add(animal); // Добавьте животное
            } else if (command == 3) {
                System.out.println("Какое животное нужно удалить?");
                String animal = scanner.next();
                if (animals.isEmpty()) {
                    continue;// Удалите животное, если список не пуст
                } else {
                    if (animals.contains(animal)) {
                        int remove = animals.indexOf(animal);
                        animals.remove(remove);
                        System.out.println("Животное " + animal + " удалено");
                    } else {
                        System.out.println("Животного с названием " + animal + " нет в списке");
                    }

                }

            } else if (command == 4) {
                if ( animals.isEmpty()) {   // Очистите список
                    System.out.println("Список и так пуст");
                } else {
                    animals.clear();
                    System.out.println("Все животные перевезены в другой зоопарк. Список пуст.");
                }

            } else if (command == 5) {
                System.out.println("Какое животное вы хотите увидеть в зоопарке?");
                String animal = scanner.next(); // Допишите условия
                if (animals.contains(animal)) {
                    System.out.println(animal + " на месте! Приходите посмотреть.");

                } else {
                    System.out.println("Такого животного сейчас нет в нашем зоопарке.");
                }

            } else {
                break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("1 - Показать список животных в зоопарке.");
        System.out.println("2 - Добавить животное в список.");
        System.out.println("3 - Удалить животное из списка.");
        System.out.println("4 - Очистить список.");
        System.out.println("5 - Проверить, есть ли в зоопарке животное.");
        System.out.println("Любая другая цифра - Выйти из приложения.");
    }
}
