package simulate4;

public class S2 {

    public static void main(String[] args) {

        int a = 100;
        int b = 0;

        System.out.println(a / 0.0);

        System.out.println(1 == 1.0);
        System.out.println(1.0f == 1.0d);
        System.out.println(1.0f == 1l);

        // não compila, tipo não primitivo só aceita != e ==
        //System.out.println("Mario" > "Guilherme");

        int c = 5;
        System.out.println(c = 5); // não imprime true, imprime 5


        double positiveInfinity = 100 / 0.0;
        double negativeInfinity = -100 / 0.0;

        System.out.println(positiveInfinity + negativeInfinity);

        System.out.println(a / b);


    }
}
