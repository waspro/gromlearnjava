package lesson5;

import java.util.Arrays;

public class ExSorting {
    public static void main(String[] args) {
        int[] array = {1, 0, 5, 9, 8, 6, 4, 7, 3, 2};

        sortAscending(array);
        System.out.println(Arrays.toString(array));

        sortDescending(array);
        System.out.println(Arrays.toString(array));

    }


    public static int[] sortAscending(int[] array) {

        /*Внешний цикл каждый раз сокращает фрагмент массива,
        так как внутренний цикл каждый раз ставит в конец
        фрагмента максимальный элемент*/
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }

    public static int[] sortDescending(int[] array) {

        /*Внешний цикл каждый раз сокращает фрагмент массива,
        так как внутренний цикл каждый раз ставит в конец
        фрагмента минимальный элемент*/
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }
}