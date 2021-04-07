package test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test17 {

    public static void main(String[] args) {

        List<Person> persons =  Arrays.asList(
                new Person("Ivson", 15),
                new Person("André", 18),
                new Person("Paul", 30)
        );

        Stream<Person> stream = persons.stream();

        Optional<Person> opt =
        stream.filter(p -> p.getIdade() >= 18)
               .min(Comparator.comparing(Person::getIdade));
        System.out.println(opt);

        // cannot call 2 final operations on the same STREAM
        /*Optional<Person> opt2 =
                stream.filter(p -> p.getIdade() >= 18)
                        .max(Comparator.comparing(Person::getIdade));
        System.out.println(opt2);

         */

        Optional<Person> opt2 =
                persons.stream().max(Comparator.comparing(Person::getIdade));
        System.out.println(opt2);


        Map<Integer, Long> map =
                persons.stream().collect(
                        Collectors.groupingBy(
                                Person::getIdade,
                                Collectors.counting()
                        )
        );
        System.out.println(map);
    }
}
