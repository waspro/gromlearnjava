package lesson8.accounts;

public class Account {
    String bankName;
    String ownerName;
    int moneyAmount;

    public Account(String bankName, String ownerName, int moneyAmount) {
        this.bankName = bankName;
        this.ownerName = ownerName;
        this.moneyAmount = moneyAmount;
    }

    void depositMoney(int amount) {
        moneyAmount += amount;
    }

    // overloading
    // Одинаковое название методов в одном классе тоже возможно,
    // но только при условии, что тип принимаемого значения у них
    // будет отличаться

    void depositMoney() {
        moneyAmount += 1000;
        System.out.println("deposit was successful");
    }

    void changeOwnerName(String newOwnerName) {
        ownerName = newOwnerName;
    }

}