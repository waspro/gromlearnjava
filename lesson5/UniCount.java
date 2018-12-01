package lesson5;

public class UniCount {
    public static void main(String[] args) {

        int[] array = {11, 12, 10, 5, 4, 100, 44, 11, 10, 11};
        System.out.println(uniqueCount(array));
    }

    static int uniqueCount(int[] array) {
        int res = 0;        // Декларация и присвоение значения переменной, в которую будет помещён конечный результат
        int cUnique = 0;    // Декларация и присвоение значения переменной, в которую будет помещён результат количества уникальных значений
        int count = 0;      // Декларация и присвоение значения переменной, в которую будет помещён результат количества повторяющихся значений

        for (int i = 0; i < array.length; i++) {
            cUnique++;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;
                    break;
                }
            }
        }
        return res = cUnique - count;
    }
}
