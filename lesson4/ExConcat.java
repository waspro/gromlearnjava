package lesson4;

public class ExConcat {
    public static void main(String[] args) {

        System.out.println(concat("I ","learn ","Java "));
    }


    public static String concat(String s1, String s2, String s3){

        String con = s1 + s2 + s3;

        return con;

    }
}
