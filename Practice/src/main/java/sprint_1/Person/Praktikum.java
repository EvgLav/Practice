package sprint_1.Person;

import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя пользователя:");
        String name = scanner.nextLine();
        PersonAccount user = new PersonAccount(name);

        System.out.println("Хотите открыть счёт в RUB?");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        int command = scanner.nextInt();
        if (command == 1) {
            user.hasRUB = true;
        }


        System.out.println("Хотите открыть счёт в USD?");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        command = scanner.nextInt();
        if (command == 1) {
            user.hasUSD = true;
        }

        System.out.println("Хотите открыть счёт в EUR?");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        command = scanner.nextInt();
        if (command == 1) {
            user.hasEUR = true;
        }

        System.out.println("Поздравляем, аккаунт для пользователя " + user.name + " создан.");
        System.out.println("Открытые счета:");
        if (user.hasRUB) {
            System.out.println("- RUB");
        }
        if (user.hasUSD) {
            System.out.println("- USD");
        }
        if (user.hasEUR) {
            System.out.println("- EUR");
        }

    }
}


