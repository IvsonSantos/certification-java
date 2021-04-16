package test;

import java.util.function.*;

public class Test21 {

    public static void main(String[] args) {

        long max = Long.max(1L, 2L);


        BinaryOperator<Long> sum = (l1, l2) -> l1 + l2;

        Supplier<String> s = () -> "a";
        BiPredicate<Integer, Integer> t = (x, y) -> x == y;

        //UnaryOperator<Integer> u1 = (final String x) -> x;
        UnaryOperator<Integer> u2 = (var x) -> x * 2;
        UnaryOperator<Integer> u3 = (x) -> x * 3;
        IntUnaryOperator iu1 = (final var x) -> x*4;
        IntUnaryOperator iu2 = (var x) -> x*4;
        IntUnaryOperator iu3 = (x) -> x*4;

        int var2 = 1;
        var x = 2;
        var var = 2;

        //Consumer<String> con1 = final String x -> System.out.println(x);
        //Consumer<String> con2 = final var x -> System.out.println(x);
        //Consumer<String> con3 = final x -> System.out.println(x);
        BiConsumer<String, String> biCon1 = (final var a, final var b) -> System.out.println(a+b);
        //BiConsumer<String, String> biCon2 = (final var a, b) -> System.out.println(a+b);
        BiConsumer<String, String> biCon3 = (final var a, var b) -> System.out.println(a+b);


        DoubleFunction<Double> area = r -> Math.PI*r*r;
        BiFunction<Integer, Integer, Integer> divide = (c, d) -> c/d;
        //DoublePredicate<Integer, Integer> dp = (e, f) -> e == f;
        IntPredicate f = m -> m == 10;

     }
}
