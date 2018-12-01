package lesson6;

public class Car { // <- Шапка класса

    // ТЕОРИЯ:
    // Класс - это шаблон для создания объектов
    // В класс записываются все свойства и поведения

    // 1. Поля, свойства (Fields, Class Members, Instance variables - это всё названия блока полей)
    //    Для каждого поля, можно использовать область видимости (private, public, ...)

    int price;
    int yearOfManufacturing;
    String color;
    String ownerName;
    double weight;
    int horsePower;

    // и так далее...


    // 2. Конструкторы (Constructors) - Правило по которому будет создаваться объект в будущем
    //    Создание конструктора, можно вызвать горящими клавишами Alt+Insert
    //    НЕ РЕКОМЕНДУЕТСЯ в классе использовать больше трёх конструкторов

    public Car(int price, int yearOfManufacturing, String ownerName) {  // в данном случае тип возвращаемого зачения Car

        this.price = price;                             // Используя ключевое слово this,
        this.yearOfManufacturing = yearOfManufacturing; // мы указываем на текущий класс
        this.ownerName = ownerName;                     // в котором это слово используется
    }


    // 3. Методы (Methods) - Описывают поведение класса

    void startRun() {
        System.out.println("I am running....");
    }

    void stopRun() {
        System.out.println("I am stopping....");
    }

    void changeOwner(String newOwnerName) {         // Метод присваивающий полю ownerName - новое значение
        ownerName = newOwnerName;
    }


    // 4. Формально, в классе может быть и другой класс(ы), он называется внутренним классом (Inner class)

    private class Test {

    }
}