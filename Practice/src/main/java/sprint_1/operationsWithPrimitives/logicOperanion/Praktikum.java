package sprint_1.operationsWithPrimitives.logicOperanion;

import java.util.Scanner;

public class Praktikum {

    private static String getSeasonByNumber(int monthNumber) {
        // Допишите условия ветвления в виде утверждений
        if (0 < monthNumber && monthNumber <= 2) {
            return "Зима";
        } else if (monthNumber >= 3 && monthNumber <= 5) {
            return "Весна";
        } else if (monthNumber >= 6 && monthNumber <= 8) {
            return "Лето";
        } else if (monthNumber >= 9 && monthNumber <= 11) {
            return "Осень";
        } else {
            return "Зима";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monthNumber;

        while (true) {
            System.out.println("Когда планируется путешествие? Введите номер месяца от 1 до 12.");
            monthNumber = scanner.nextInt();


            /* Допишите ветвление, которое будет печатать строку:
            System.out.println("Летом лучше остаться в Москве.");
              и завершать выполнение программы */
            if (monthNumber > 12 || monthNumber < 0) { // Инвертируйте условие
                System.out.println("Некорректный номер месяца. Введите ещё раз.");
                continue;
            } else {
                String season = getSeasonByNumber(monthNumber);
                if (season.equals("Лето")) {
                    System.out.println("Летом лучше остаться в Москве");
                    break;
                }
            }


            System.out.println("Укажите стоимость прямых билетов из Москвы в Париж:");
            int ticketMoscowParis = scanner.nextInt();
            System.out.println("Укажите стоимость билетов из Москвы в Париж с пересадкой в Лондоне:");
            int ticketMoscowLondonParis = scanner.nextInt();
            System.out.println("У вас есть британская виза?");
            System.out.println("1 - да, виза есть");
            System.out.println("0 - визы нет");
            int britainVisa = scanner.nextInt();


            if (ticketMoscowParis < ticketMoscowLondonParis) {
                System.out.println("Летим прямым рейсом в Париж");
            } else if (ticketMoscowParis > ticketMoscowLondonParis) {
                if (britainVisa == 1) {
                    System.out.println("Летим с пересадкой через Лондон");
                } else {
                    System.out.println("придется либо оформить визу либо лететь прямым рейсом");
                }
            } else {
                if (britainVisa == 1) {
                    System.out.println("Придется выбрать самому");
                } else {
                    System.out.println("Только прямой рейс или оформить визу");
                }
            }
        }
    }
}














