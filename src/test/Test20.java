package test;

import java.util.StringJoiner;

public class Test20 {

    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(", ");
        sj.add("one").add("two").add("three");
        System.out.println(sj);

        StringJoiner sj2 = new StringJoiner(", ", "{","}");
        sj2.add("one").add("two").add("three");
        System.out.println(sj2);

        String s = String.join(", ", "um", "dois");
        System.out.println(s);

        String[] tab = {"um, dois"};
        String s2 = String.join(", ", tab);
        System.out.println(s2);
    }
}
