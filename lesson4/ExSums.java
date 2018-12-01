package lesson4;

public class ExSums {
    public static void main(String[] args) {

        System.out.println(compareSums(0, 10, 10, 20));
    }

    public static boolean compareSums(int a, int b, int c, int d) {

        return sum(a,b) > sum(c,d);

        /*long res1 = sum(a, b);
        long res2 = sum(c, d);

        boolean comp = res1 > res2;
        return comp;*/

    }

    public static long sum(int from, int to) {
        long res = 0;
        for (long i = from; i <= to; i++) {
            res += i;
        }
        return res;
    }

    /*public static boolean bul(long a, long b){
        boolean ret = a > b;
        return ret;

    }*/
}