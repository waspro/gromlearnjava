package lesson5;

import java.util.Arrays;

public class BankPractiseNew {
    public static void main(String[] args) {
        String[] names = {"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina", "John"};
        int[] balances = {100, 500, 8432, -99, 12000, -54, 0};

        //Тестирование методов
        System.out.println(Arrays.toString(findClientsByBalance(names, balances, -100)));
        System.out.println(Arrays.toString(findClientsWihNegativeBalance(names, balances)));

        depositMoney(names, balances, "Ann", 1000);
        System.out.println(Arrays.toString(balances));

        System.out.println();
        System.out.println(withdraw(names, balances, "Ann", 100));
    }

    // 1 задание. Находим клиента с балансом больше n
    static String[] findClientsByBalance(String[] clients, int[] balances, int n) { // <- Сигнатура метода

        //Создаём массив, куда будут записываться все результаты и определяем его длину

                                                          /*такой метод не очень подходит,
        String[] results = new String[clients.length];   <- потому что резервирует больше
                                                            памяти, чем нужно*/

        //Алгоритм решения задачи:
        // 1. Находим количество результатов
        // 2. Создаём массив с уже известной длиной результата
        // 3. Записываем результат

        //РЕАЛИЗАЦИЯ
        // 1. Пробегаем по всем балансам и находим количество клиентов(результатов) с необходимым условием
        int count = 0;
        for (int balance : balances) {
            if (balance >= n)
                count++;
        }

        // 2. Теперь уже создаём массив с известной длиной (count), определённой в первом пункте
        String[] results = new String[count];

        // 3. Теперь нам нужно ещё раз пробежаться по массиву balances и если баланс больше n,
        //    то записываем клиента. Учитывая, что массивы одной длины, то чтобы это сделать,
        //    нужно знать индекс элемента массива.
        int index = 0;      //Индекс существующего массива
        int resIndex = 0;   //Результирующий индекс
        for (int balance : balances) {
            if (balance >= n) {
                results[resIndex] = clients[index]; // В массив resIndex записываем элементы массива clients
                resIndex++;                         // только подходящего условию, т.е. balance >= n
            }
            index++;
        }
        return results;
    }

    // 2 задание. Находим клиента с отрицательным балансом
    static String[] findClientsWihNegativeBalance(String[] clients, int[] balances) {

        //Алгоритм решения задачи:
        // 1. Находим количество результатов
        // 2. Создаём массив с уже известной длиной результата
        // 3. Записываем результат

        //РЕАЛИЗАЦИЯ
        // 1. Пробегаем по всем балансам и находим количество клиентов(результатов) с необходимым условием
        int count = 0;
        for (int balance : balances) {
            if (balance < 0)
                count++;
        }

        // 2. Теперь уже создаём массив с известной длиной (count), определённой в первом пункте
        String[] results = new String[count];

        // 3. Теперь нам нужно ещё раз пробежаться по массиву balances и если баланс меньше 0,
        //    то записываем клиента. Учитывая, что массивы одной длины, то чтобы это сделать,
        //    нужно знать индекс элемента массива.
        int index = 0;      //Индекс существующего массива
        int resIndex = 0;   //Результирующий индекс
        for (int balance : balances) {
            if (balance < 0) {
                results[resIndex] = clients[index]; // В массив resIndex записываем элементы массива clients
                resIndex++;                         // только подходящего условию, т.е. balance >= n
            }
            index++;
        }
        return results;
    }

    //3 задание. Пополнениебаланса с правилом, если сумма пополнения <= 100 (комиссия 2%),
    //если больше 100 (комиссия 1%)
    static void depositMoney(String[] clients, int[] balances, String client, int money) {

        //Алгоритм решения задачи:
        // 1. Находим клиента в базе (в нашем случае, в массиве)
        // 2. Считаем сумму пополнения с учётом комиссии
        // 3. Обновляем баланс (пополняем)

        // РЕАЛИЗАЦИЯ
        // 1. Находим клиента - это значит находим его индекс.
        int clientIndex = 0;
        for (String cl : clients) { //Пробегаем по всем существующим клиентам до первого нахождения
            if (cl == client)       //Проверяем, что текущий клиент равен имени запрашиваемого клиента
                break;              //Если находим, цикл - стопорится
        }
        clientIndex++;              //Если не находим, то увеличиваем clientIndex на 1 и идём к следующему

        // 2. Считаем сумму на которую, мы должны пополнить депозит с учётом комиссии
        //    Так как, сумма может оказаться дробной, приводим результат к типу int
        int moneyToDeposit = money <= 100 ? (int) (money - money * 0.02) : (int) (money - money * 0.01);

        // 3. Обновляем баланс
        // Так как мы знаем индекс клиента которому нужно пополнить баланс, мы чётко пополняем баланс
        balances[clientIndex] += moneyToDeposit;
    }


    //Для использования кусков кода в будущем, можно некоторые реализации вынести в отдельные методы
    //например "Поиски индекса клиента"
    static int findClientIndexByName(String[] clients, String client) {
        int clientIndex = 0;
        for (String cl : clients) {
            if (cl == client) {
                break;
            }
            clientIndex++;
        }
        return clientIndex;
    }

    //Также, в метод можно вынести подсчёт суммы пополнения
    static int calculateDepositAmountAfterComission(int money) {
        return money <= 100 ? (int) (money - money * 0.02) : (int) (money - money * 0.01);
    }

    //4 задание. Снятие денег со счёта. Если денег недостаточно, то нужно вернуть -1
    static int withdraw(String[] clients, int[] balances, String client, int amount) {

        //Алгоритм решения задачи:
        // 1. Находим клиента в базе с помощью ранее созданного метода
        // 2. Обновляем баланс (учитывая условие)

        //1
        if (balances[findClientIndexByName(clients, client)] >= amount) {
            return balances[findClientIndexByName(clients, client)] -= amount;
        } else {
            return -1;
        }
    }
}