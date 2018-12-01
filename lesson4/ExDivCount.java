package lesson4;

public class ExDivCount {
    public static void main(String[] args) {

        short a = 0;
        short b = 100;
        System.out.println(findDivCount(a,b,3));

    }

    public static int findDivCount(short a, short b, int n) {

        int count = 0;

        for (int i = a; i <= b; i++) {
            if (i % n == 0)
                count++;
        }

        return count;


    }
}
