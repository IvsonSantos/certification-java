package test;

import java.util.Arrays;
import java.util.Comparator;

public class Test19 implements Comparator<String> {

    public int compare(String s1, String s2) {
        return s2.length() - s1.length();
    }

    public static void main(String[] args) {

        String[] names = {"Mary","Jane","Elizabeth","Jo"};
        Arrays.sort(names, new Test19());
        for (String name: names) {
            System.out.println(name);
        }
    }
}
