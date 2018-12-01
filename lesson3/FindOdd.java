package lesson3;

public class FindOdd {
    public static void main(String[] args) {
        int res = 0;
        int sum = 0;

        for (int a = 0; a <= 1000; a++) {
            if (a % 2 != 0)
                System.out.println("Found");
            sum += a;
        }

        res = sum * 5;

        if (res > 5000)
            System.out.println("Bigger");
        else
            System.out.println("Smaller or equal");
    }
}
