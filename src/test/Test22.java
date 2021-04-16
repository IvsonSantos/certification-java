package test;

import multiples.Interface2;

public class Test22 {

    public static void main(String[] args) {
        int oct = 07;
        int first = 012;
        int second = 022;

        int a, b, c;
        int d,
            e,
            f;

        System.out.println(oct);
        System.out.println(first);
        System.out.println(second);

        int sum = first + second;
        System.out.println(sum);

        System.out.println(Integer.toOctalString(sum));
    }
}
