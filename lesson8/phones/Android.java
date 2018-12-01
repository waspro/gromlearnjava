package lesson8.phones;

public class Android extends Phone {    // ключевое слово extends - означает наследование
    String androidVersion;
    int screenSize;

    String secretDeviceCode;

    public Android(int price, double weight, String countryProduced, String androidVersion, int screenSize, String secretDeviceCode) {
        super(price, weight, countryProduced);

        // this - это ссылка на объект текущего класса
        // super - это ссылка на родительский класс (суперкласс)

        this.androidVersion = androidVersion;
        this.screenSize = screenSize;
        this.secretDeviceCode = secretDeviceCode;
    }

    void installNewAndroidVersion() {
        System.out.println("installNewAndroidVersion invoked...");
    }
}
