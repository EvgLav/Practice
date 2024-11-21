package sprint_1.typeOfJava.Person;

public class PersonAccount {
    String name;// Имя и фамилия
    double moneyRUB;
    boolean hasRUB;  // Счёт в рублях
    double moneyUSD;
    boolean hasUSD;  // Счёт в долларах
    double moneyEUR;
    boolean hasEUR;  // Счёт в евро



    PersonAccount(String userName) {
        name = userName;
        this.hasRUB = false;
        this.hasUSD = false;
        this.hasEUR = false;
    }

}

