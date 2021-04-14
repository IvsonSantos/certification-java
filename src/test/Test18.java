package test;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;

public class Test18 {

    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("Ivson", 15, LocalDate.of(1980, Month.APRIL, 06)),
                new Person("André", 18, LocalDate.of(1990, Month.AUGUST, 06)),
                new Person("Paul", 30, LocalDate.of(2000, Month.NOVEMBER, 06))
        );

        LocalDate now = LocalDate.of(2014, Month.MARCH, 12);

        persons.stream().forEach(
                p -> {
                    Period period = Period.between(p.getDateOfBirth(), now);
                    System.out.println(p.getNome() + " nasceu em " +
                            period.get(ChronoUnit.YEARS) + " anos e " +
                            period.get(ChronoUnit.MONTHS) + " meses " +
                            "[" + p.getDateOfBirth().until(now, ChronoUnit.MONTHS) + " meses]");
                }
        );

    }
}
