package lesson6;

public class Demo {
    public static void main(String[] args) {
        Car carObject = new Car(10000, 2015, "Anton");  // объект car можно ещё назвать переменной типа car
        System.out.println(carObject.color);
        System.out.println(carObject.horsePower);

        System.out.println(carObject.ownerName);

        carObject.horsePower = 100;

        System.out.println(carObject.horsePower);

        carObject.startRun();
        carObject.stopRun();

        carObject.changeOwner("Test");

        System.out.println(carObject.ownerName);

        // null - пустое значение для сложных типов
        // 0 - пустое значение для примитивных типов

        Car carObject2 = null;
        System.out.println(carObject2);
    }
}
