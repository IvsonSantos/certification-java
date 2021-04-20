package test;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class Test24 {

    public static void main(String[] args) {
        final char a = 'A', d = 'D';
        char grade = 'B';

        switch (grade) {
            case 'R':
                System.out.println("inicio");
            case a:
            case 'B':
                System.out.println("great");
            case 'C':
                System.out.println("look"); break;
            case d:
            case 'F':
                System.out.println("fim");

        }

        String s1 = "hello";
        s1 = s1 + " world";
        System.out.println(s1);

        s1 = "hello";
        s1.concat(" World");
        System.out.println(s1);

        String rep = "Abc-";
        System.out.println(rep.repeat(6));

    }

}
