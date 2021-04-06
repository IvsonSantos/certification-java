package test;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test12 {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("one","two","three","four","five");
        //stream.forEach(s -> System.out.println(s));

        Predicate<String> p1 = s -> s.length() > 3;
        Predicate<String> p2 = Predicate.isEqual("two");
        Predicate<String> p3 = Predicate.isEqual("four");

        stream.filter(p2.or(p3))
              .forEach(s -> System.out.println(s));
    }
}
