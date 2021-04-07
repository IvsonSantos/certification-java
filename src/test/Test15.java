package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test15 {

    public static void main(String[] args) {

        Object o;

        List<Person> list =  Arrays.asList(
                new Person("Ivson", 15),
                new Person("André", 18),
                new Person("Paul", 30)
        );

        Stream<Person> stream = list.stream();

        Stream<String> names = stream.map(person -> person.getNome());


    }
}
