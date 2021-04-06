package test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test13 {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("one","two","three","four","five");

        Predicate<String> p1 = Predicate.isEqual("two");
        Predicate<String> p2 = Predicate.isEqual("four");

        List<String> list = new ArrayList<>();

        stream.peek(System.out::println)
              .filter(p1.or(p2))
              //.peek(list::add);
              .forEach(list::add);

        System.out.println("Done");
        System.out.println("size = " + list.size());
    }
}
