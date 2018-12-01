package lesson5;

import java.util.Arrays;
// Этот класс - это описание урока по массивам
public class LearnArray {
    public static void main(String[] args) {


        //ОБЩИЕ ВАЖНЫЕ МОМЕНТЫ
        //1. Массив - это структура данных (примитивная)
        //2. Все элементы массива начинаются с индекса 0
        //3. Длину массива нельзя изменять и изменить


        //Пример объявления и инициализации переменной
        int a; //Объявление(declaration) переменной типа int
        a = 10; //Инициализация(initialization)

        //Объявляем тип массива [] имя массива = new тип массива [длина массива];
        int[] firstArray = new int[3];  //Объявление(declaration) массива с [3] элементами типа int

        //Имя массива [index]; <- получение элемента массива

        //Все элементы массива изначально инициализируются со значением 0

        firstArray[0] = 11;     // Инициализация(initialization) элемента [0]
        firstArray[1] = 200;    // Инициализация(initialization) элемента [1]
        firstArray[2] = -10;    // Инициализация(initialization) элемента [2]

        //Объявление и инициализация массива одной строкой. БОЛЕЕ ПРЕДПОЧТИТЕЛЬНО!
        int[] secondArray = {1, 10, 15, 20, -50, 10};

        //Вывод масива в консоль с помощью цикла for, а также применением метода length,
        //который автоматически считает длину массива
        for (int i = 0; i < firstArray.length; i++) {
            System.out.println(firstArray[i]);
        }

        //Также можно использовать библиотеку Arrays из JDK,
        //в частности метод toString, который выведет наш массив в удобной форме
        System.out.println(Arrays.toString(firstArray));


        //ВНИМАНИЕ! Использование цикла foreach позволяет пробежаться
        //по каждому элементу структуры данных (видео с 19:48, Урок 5)
        //Синтаксис:
        //for ( тип структуры данных  название переменной в которую будет записываться каждый элемент
        //структуры данных : структура данных по которой происходит пробежка) { код для исполнения }
        for (int element : secondArray) {
            System.out.println(element);
        }

        //По сути, foreach выполняет следующие действия
        for (int i = 0; i < firstArray.length; i++) {
            int element = firstArray[i]; // Присваивает переменной element, значение элемента массива
            System.out.println(element); // Выводит значение уже из переменной element в консоль
        }

        //ОБЩИЕ ПОНЯТИЯ О СТРУКТУРАХ ДАННЫХ
        //1. Структура данных хранит элементы одного типа
        //2. Данные могут быть структурированы по какому-то правилу
        //3. Длина структуры данных может менятся, а может и не менятся.

        //Нахождение максимального элемента массива

        //Тестирование методов
        System.out.println();
        System.out.println(maxArray(secondArray));          // Тест метода maxArray

        System.out.println();
        System.out.println(nCount(secondArray, 10));    // Тест метода nCount

    }
        //Нахождение максимального элемента массива
        public static int maxArray(int[] array) {
            int max = array[0];         // Гипотетически предполагаем, что максимальный элемент
                                        // находится в 0-ом элементе
            for (int element : array){  // Перебираем массив
                if (element > max)      // Сравниваем, если какой-то element больше max,
                    max = element;      // то присваиваем его значение - элементу max
            }
            return max;                 // Возвращаем max
        }

        //Счётчик количества вхождения числа n в массив
        public static int nCount(int[] array, int n) {
            int count = 0;              // Переменная, в которой будет храниться количество вхождений

            for (int element : array){  // Перебираем массив
                if (element == n)       // Сравниваем значение element с числом n
                    count++;            // Если находим, то счётчик увеличиваем на 1
            }
            return count;               // Возвращаем значение счётчика
        }

}