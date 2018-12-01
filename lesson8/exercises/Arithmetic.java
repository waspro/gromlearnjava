package lesson8.exercises;

public class Arithmetic {

    public Arithmetic() {
    }

    boolean check(int[] array) {

        // Находим максимальное и минимальное значение массива
        int max = array[0];
        int min = array[0];

        for (int el : array) {
            if (max < el)
                max = el;
            if (min > el)
                min = el;
        }

        // Возвращаем true, если сумма max и min больше 100 и false если меньше
        return ((max + min) > 100);
    }
}