package lesson2;

public class SumAndDivision {
    public static void main(String[] args) {
        int res = 0;
        int b, c;
        int d = 1234;
        boolean bcTrue = true;
        boolean bcFalse = false;

        for (int a = 1; a <= 1000; a++){
            res += a;
        }
        //System.out.println(res);
        //System.out.println();

        b = res / d;
        //System.out.println(b);

        c = res % d;
        //System.out.println(c);

        while (b > c) {
            System.out.println(bcFalse);
            break;
        }

        while (b < c) {
            System.out.println(bcTrue);
            break;
        }
    }
}
