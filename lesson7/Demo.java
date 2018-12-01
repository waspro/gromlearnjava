package lesson7;

import lesson6.Car;
import lesson6.DbConnector;
import lesson6.User;    // Импортируем класс или библиотеку в текущий класс

public class Demo {
    public static void main(String[] args) {

        // Синтаксис создания объекта
        // class_name (ещё называют type) object_name = new class_name();            <- может быть без атрибутов
        // class_name (ещё называют type) object_name = new class_name(attributes);  <- может быть с атрибутами

        // СПРАВКА! Если класс подсвечен красным шрифтом, нужно нажать Alt + Enter и выбрать какой класс импортировать
        User user = new User(); // Теперь user является объектом
        User user1 = new User();
        User user2 = new User();

        User user3 = new User("Jack");

        Car car = new Car(10000, 2015, "Anton");

        // В любом классе JAVA по умолчанию есть пустой конструктор, если в классе не создано ни
        // одного конструктора, то JAVA использует этот скрытый конструктор.
        // Данное правило верно до момента создания любого кастомного конструктора.
        DbConnector dbConnector = new DbConnector();
    }
}