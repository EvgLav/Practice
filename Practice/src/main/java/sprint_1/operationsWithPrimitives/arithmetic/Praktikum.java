package sprint_1.operationsWithPrimitives.arithmetic;

import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("На сколько кусков порезана пицца?");
        int slicesInPizza = scanner.nextInt();
        System.out.println("Сколько кусков съедает один участник встречи?");
        int slicesToPerson = scanner.nextInt();
        printMaximumPeopleToMeeting(slicesToPerson, slicesInPizza);
    }

    private static void printMaximumPeopleToMeeting(int slicesToPerson, int slicesInPizza) {
        int numOfPizzas = 2;
        int totalSlices = slicesInPizza * numOfPizzas; // Посчитайте общее число кусков пиццы
        int maximumPeopleToMeeting = (totalSlices / slicesToPerson) ; // На сколько человек хватит пиццы
        int leftSlices = totalSlices - ( slicesToPerson * maximumPeopleToMeeting); // Сколько пиццы останется
        System.out.println("Максимальное число участников идеальной встречи: " + maximumPeopleToMeeting);
        System.out.println("Останется кусков пиццы: " + leftSlices);
    }
}