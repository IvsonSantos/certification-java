package test;

public class Test23 {

    int a;

    public static void main(String[] args) {

        int a = 1;

        System.out.println(a);

        int b = 5;
        int c = 4;

        System.out.println(a-- + --b / b-- );

        System.out.println(c/b);

        long e = 3;
        long f = 2;

        long i = e + 3 * (f = 3);
        System.out.println(i);

        long z = 2 + (f = 6);
        System.out.println(z);
    }
}
