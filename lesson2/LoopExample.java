package lesson2;

public class LoopExample {
    public static void main(String[] args) {
        // for loop
        // while loop
        // for each loop (!)
        // do while loop

        //1. while loop
        int a = 15;

        while (a <= 10) {
            System.out.println(a);
            a++;
        }

        // 2. do-while loop
        do {
            System.out.println(a);
            a++;
        } while (a <= 10);
    }
}
