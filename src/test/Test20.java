package test;

import java.util.StringJoiner;

public class Test20 {

    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(", ");
        sj.add("one").add("two").add("three");

        System.out.println(sj);
    }
}
