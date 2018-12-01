package lesson2;

public class SumOfNumbers {
    public static void main(String[] args) {
        long res = 0;

       for(int a = 0; a <= 10000000; a++) {
            res += a;
        }

        System.out.println(res);
    }
}
